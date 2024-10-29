import java.util.Scanner;
public class Person {
    private String fullName;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;
    public Person() {
    }
    public Person(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.address = address;
    }
    public Person(Person other) {
        this.fullName = other.fullName;
        this.dateOfBirth = other.dateOfBirth;
        this.phoneNumber = other.phoneNumber;
        this.city = other.city;
        this.country = other.country;
        this.address = other.address;
    }
    public void inputPersonData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        this.fullName = scanner.nextLine();
        System.out.print("Введите дату рождения (дд.мм.гггг): ");
        this.dateOfBirth = scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Введите город: ");
        this.city = scanner.nextLine();
        System.out.print("Введите страну: ");
        this.country = scanner.nextLine();
        System.out.print("Введите домашний адрес: ");
        this.address = scanner.nextLine();
    }
    public void displayPersonData() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Дата рождения: " + this.dateOfBirth);
        System.out.println("Контактный телефон: " + this.phoneNumber);
        System.out.println("Город: " + this.city);
        System.out.println("Страна: " + this.country);
        System.out.println("Домашний адрес: " + this.address);
    }
    public void displayPersonData(boolean showContactInfo) {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Дата рождения: " + this.dateOfBirth);
        if (showContactInfo) {
            System.out.println("Контактный телефон: " + this.phoneNumber);
            System.out.println("Город: " + this.city);
            System.out.println("Страна: " + this.country);
            System.out.println("Домашний адрес: " + this.address);
        } else {
            System.out.println("Контактная информация скрыта.");
        }
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.inputPersonData();
        System.out.println("\nВведённые данные:");
        person1.displayPersonData();
        Person person2 = new Person("Иван Иванов", "01.01.1990", "+123456789", "Москва", "Россия", "ул. Пушкина, дом 1");
        System.out.println("\nДанные, созданные с помощью конструктора с параметрами:");
        person2.displayPersonData(false);
        Person person3 = new Person(person2);
        System.out.println("\nКопия данных второго человека:");
        person3.displayPersonData(true);
    }
}
