import java.util.Scanner;
public class Car {
    private String carName;
    private String manufacturer;
    private int year;
    private double engineVolume;
    public Car() {
        this.carName = "";
        this.manufacturer = "";
        this.year = 0;
        this.engineVolume = 0.0;
    }
    public Car(String carName, String manufacturer, int year, double engineVolume) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }
    public void inputCarData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название автомобиля: ");
        this.carName = scanner.nextLine();
        System.out.print("Введите название производителя: ");
        this.manufacturer = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        System.out.print("Введите объём двигателя (л): ");
        this.engineVolume = scanner.nextDouble();
    }
    public void displayCarInfo() {
        System.out.println("Название автомобиля: " + carName);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объём двигателя: " + engineVolume + " л");
    }
    public void displayCarInfo(boolean showNameAndManufacturer) {
        if (showNameAndManufacturer) {
            System.out.println("Название автомобиля: " + carName);
            System.out.println("Производитель: " + manufacturer);
        } else {
            displayCarInfo();
        }
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Введите данные об автомобиле:");
        car.inputCarData();
        System.out.println("\nИнформация об автомобиле:");
        car.displayCarInfo();
        System.out.println("\nВывод только названия автомобиля и производителя:");
        car.displayCarInfo(true);
    }
}