package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        singOfInteger(number);
    }
    public static void singOfInteger(int number) {
        String sign = "zero";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        }
        System.out.printf("The number %d is %s.", number, sign);
    }
}
