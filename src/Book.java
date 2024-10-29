import java.util.Scanner;
public class Book {
    private String title;
    private String authorFullName;
    private int year;
    private String publisher;
    private String genre;
    private int numberOfPages;
    public Book() {
        this.title = "";
        this.authorFullName = "";
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.numberOfPages = 0;
    }
    public Book(String title, String authorFullName, int year, String publisher, String genre, int numberOfPages) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }
    public void inputBookData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();
        System.out.print("Введите ФИО автора: ");
        this.authorFullName = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите название издательства: ");
        this.publisher = scanner.nextLine();
        System.out.print("Введите жанр книги: ");
        this.genre = scanner.nextLine();
        System.out.print("Введите количество страниц: ");
        this.numberOfPages = scanner.nextInt();
    }
    public void displayBookInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("ФИО автора: " + authorFullName);
        System.out.println("Год выпуска: " + year);
        System.out.println("Издательство: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + numberOfPages);
    }
    public void displayBookInfo(boolean showTitleAndAuthor) {
        if (showTitleAndAuthor) {
            System.out.println("Название книги: " + title);
            System.out.println("ФИО автора: " + authorFullName);
        } else {
            displayBookInfo();
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorFullName() {
        return authorFullName;
    }
    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Введите данные о книге:");
        book.inputBookData();
        System.out.println("\nИнформация о книге:");
        book.displayBookInfo();
        System.out.println("\nВывод только названия и автора:");
        book.displayBookInfo(true);
    }
}
