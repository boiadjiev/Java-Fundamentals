package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int totalSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.charAt(i) + "");
            int sum = 1;

            for (int j = 2; j <= digit; j++) {
                sum *= j;
            }
            totalSum += sum;
        }
        if (totalSum == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
