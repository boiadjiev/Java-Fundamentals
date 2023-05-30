package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double garde = Double.parseDouble(scanner.nextLine());

        if (garde >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
