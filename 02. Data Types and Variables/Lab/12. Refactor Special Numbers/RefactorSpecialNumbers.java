package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int num = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= n; i++) {
            num = i;
            while (i > 0) {
                total += i % 10;
                i = i / 10;
            }
            isSpecial = (total == 5) || (total == 7) || (total == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
            total = 0;
            i = num;
        }
    }
}
