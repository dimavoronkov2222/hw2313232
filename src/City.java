import java.util.Scanner;
public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;
    public City() {
    }
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }
    public City(City other) {
        this.cityName = other.cityName;
        this.regionName = other.regionName;
        this.countryName = other.countryName;
        this.population = other.population;
        this.postalCode = other.postalCode;
        this.phoneCode = other.phoneCode;
    }
    public void inputCityData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        this.cityName = scanner.nextLine();
        System.out.print("Введите название региона: ");
        this.regionName = scanner.nextLine();
        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        while (true) {
            try {
                this.population = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Неверный формат. Введите количество жителей снова: ");
            }
        }
        System.out.print("Введите почтовый индекс: ");
        this.postalCode = scanner.nextLine();
        System.out.print("Введите телефонный код города: ");
        this.phoneCode = scanner.nextLine();
    }
    public void displayCityData() {
        System.out.println("Название города: " + this.cityName);
        System.out.println("Название региона: " + this.regionName);
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Почтовый индекс: " + this.postalCode);
        System.out.println("Телефонный код: " + this.phoneCode);
    }
    public void displayCityData(boolean showFullData) {
        System.out.println("Название города: " + this.cityName);
        System.out.println("Название страны: " + this.countryName);
        if (showFullData) {
            System.out.println("Название региона: " + this.regionName);
            System.out.println("Количество жителей: " + this.population);
            System.out.println("Почтовый индекс: " + this.postalCode);
            System.out.println("Телефонный код: " + this.phoneCode);
        } else {
            System.out.println("Дополнительная информация скрыта.");
        }
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
    public static void main(String[] args) {
        City city1 = new City();
        city1.inputCityData();
        System.out.println("\nИнформация о городе:");
        city1.displayCityData();
        City city2 = new City("Будапешт", "Центральная Венгрия", "Венгрия", 1752286, "1011", "+36");
        System.out.println("\nДанные, созданные с помощью конструктора с параметрами:");
        city2.displayCityData(false);
        City city3 = new City(city2);
        System.out.println("\nКопия данных второго города:");
        city3.displayCityData(true);
    }
}
