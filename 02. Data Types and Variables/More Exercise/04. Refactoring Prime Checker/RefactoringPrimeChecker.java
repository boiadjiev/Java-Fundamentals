package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= maxNum; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b\n", number, isPrime);
        }
    }
}
