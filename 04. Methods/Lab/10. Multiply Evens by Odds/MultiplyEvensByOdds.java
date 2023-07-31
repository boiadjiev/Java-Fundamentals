package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(multiplyEvensAndOddsSum(number));
    }

    private static int multiplyEvensAndOddsSum(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int number) {
        int evenSum = 0;

        while (number > 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            }
            number /= 10;
        }
        return evenSum;
    }

    private static int getOddSum(int number) {
        int oddSum = 0;

        while (number > 0) {
            int currentNumber = number % 10;
            if (!(currentNumber % 2 == 0)) {
                oddSum += currentNumber;
            }
            number /= 10;
        }
        return oddSum;
    }
}
