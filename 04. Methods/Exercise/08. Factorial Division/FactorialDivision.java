package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOne = Long.parseLong(scanner.nextLine());
        double numTwo = Long.parseLong(scanner.nextLine());

        double result = factorial(numOne) / factorial(numTwo);
        System.out.printf("%.2f", result);
    }

    private static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
