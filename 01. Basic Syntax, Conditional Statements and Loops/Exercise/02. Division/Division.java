package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int div = 0;
        boolean noDiv = false;

        if (n % 10 == 0) {
            div = 10;
        } else if (n % 7 == 0) {
            div = 7;
        } else if (n % 6 == 0) {
            div = 6;
        } else if (n % 3 == 0) {
            div = 3;
        } else if (n % 2 == 0) {
            div = 2;
        } else {
            noDiv = true;
        }
        if (noDiv) {
            System.out.print("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", div);
        }
    }
}
