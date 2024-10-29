import java.util.Scanner;
public class Country {
    private String countryName;
    private String continentName;
    private long population;
    private String phoneCode;
    private String capital;
    private String mainCity;
    public Country() {
    }
    public Country(String countryName, String continentName, long population, String phoneCode, String capital, String mainCity) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.mainCity = mainCity;
    }
    public Country(Country other) {
        this.countryName = other.countryName;
        this.continentName = other.continentName;
        this.population = other.population;
        this.phoneCode = other.phoneCode;
        this.capital = other.capital;
        this.mainCity = other.mainCity;
    }
    public void inputCountryData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();
        System.out.print("Введите название континента: ");
        this.continentName = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        while (true) {
            try {
                this.population = Long.parseLong(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Неверный формат. Введите количество жителей снова: ");
            }
        }
        System.out.print("Введите телефонный код страны: ");
        this.phoneCode = scanner.nextLine();
        System.out.print("Введите название столицы: ");
        this.capital = scanner.nextLine();
        System.out.print("Введите название основного города: ");
        this.mainCity = scanner.nextLine();
    }
    public void displayCountryData() {
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Название континента: " + this.continentName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Телефонный код: " + this.phoneCode);
        System.out.println("Столица: " + this.capital);
        System.out.println("Основной город: " + this.mainCity);
    }
    public void displayCountryData(boolean showFullData) {
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Столица: " + this.capital);
        if (showFullData) {
            System.out.println("Название континента: " + this.continentName);
            System.out.println("Количество жителей: " + this.population);
            System.out.println("Телефонный код: " + this.phoneCode);
            System.out.println("Основной город: " + this.mainCity);
        } else {
            System.out.println("Дополнительная информация скрыта.");
        }
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public String getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getMainCity() {
        return mainCity;
    }
    public void setMainCity(String mainCity) {
        this.mainCity = mainCity;
    }
    public static void main(String[] args) {
        Country country = new Country();
        country.inputCountryData();
        System.out.println("\nИнформация о стране:");
        country.displayCountryData();
        System.out.println("\nИнформация о стране с использованием перегруженного метода:");
        country.displayCountryData(true);
        country.displayCountryData(false);
        Country countryCopy = new Country(country);
        System.out.println("\nКопия данных о стране:");
        countryCopy.displayCountryData();
    }
}