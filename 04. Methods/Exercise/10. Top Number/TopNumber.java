package Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (divisibleByEight(i) && holdOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleByEight(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean holdOddDigit(int number) {
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
