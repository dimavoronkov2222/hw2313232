import java.util.Scanner;
public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public void inputFractionData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        this.numerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        while (true) {
            this.denominator = scanner.nextInt();
            if (this.denominator != 0) break;
            System.out.print("Знаменатель не может быть равен 0. Введите знаменатель снова: ");
        }
        simplify();
    }
    public void displayFraction() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }
    public void displayFraction(boolean showAsDecimal) {
        if (showAsDecimal) {
            System.out.println("Дробь в десятичном виде: " + (double) numerator / denominator);
        } else {
            displayFraction();
        }
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        this.denominator = denominator;
        simplify();
    }
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction add(int value) {
        return this.add(new Fraction(value, 1));
    }
    public Fraction subtract(int value) {
        return this.subtract(new Fraction(value, 1));
    }
    public Fraction multiply(int value) {
        return new Fraction(this.numerator * value, this.denominator);
    }
    public Fraction divide(int value) {
        if (value == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return new Fraction(this.numerator, this.denominator * value);
    }
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        System.out.println("Введите первую дробь:");
        fraction1.inputFractionData();
        Fraction fraction2 = new Fraction();
        System.out.println("Введите вторую дробь:");
        fraction2.inputFractionData();
        System.out.println("\nПервая дробь:");
        fraction1.displayFraction();
        System.out.println("Вторая дробь:");
        fraction2.displayFraction();
        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("\nРезультаты:");
        System.out.print("Сумма: ");
        sum.displayFraction();
        System.out.print("Разность: ");
        difference.displayFraction();
        System.out.print("Произведение: ");
        product.displayFraction();
        System.out.print("Частное: ");
        quotient.displayFraction();
        System.out.print("\nСумма дроби и целого числа (5): ");
        Fraction sumWithInteger = fraction1.add(5);
        sumWithInteger.displayFraction();
        System.out.print("Разность дроби и целого числа (5): ");
        Fraction differenceWithInteger = fraction1.subtract(5);
        differenceWithInteger.displayFraction();
        System.out.print("Произведение дроби и целого числа (5): ");
        Fraction productWithInteger = fraction1.multiply(5);
        productWithInteger.displayFraction();
        System.out.print("Частное дроби и целого числа (5): ");
        Fraction quotientWithInteger = fraction1.divide(5);
        quotientWithInteger.displayFraction();
    }
}