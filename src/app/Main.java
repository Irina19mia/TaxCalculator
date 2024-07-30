package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static String CURRENCY = "UAH";

    private static int SCALE1 = 0;
    private static int SCALE2 = 10000;
    private static int SCALE3 = 25000;

    private static double TAX_PERCENT_1 = 2.5;
    private static double TAX_PERCENT_2 = 4.3;
    private static double TAX_PERCENT_3 = 6.7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter salary");
        double salary = scanner.nextDouble();
        System.out.printf("Salary is %.2f %s\n", salary, CURRENCY);

        double tax;

        if (salary > SCALE1 & salary <= SCALE2) {
            tax = salary * TAX_PERCENT_1 / 100;
        } else if (salary > SCALE2 & salary <= SCALE3) {
            tax = salary * TAX_PERCENT_2 / 100;
        } else if (salary > SCALE3) {
            tax = salary * TAX_PERCENT_3 / 100;
        } else {
            tax = -1;
            System.out.println("Salary can't be negative or zero");
        }

        if (tax >= 0) {
            System.out.printf("Tax from salary %.2f is %.2f %s", salary, tax, CURRENCY);
        }
    }
}
