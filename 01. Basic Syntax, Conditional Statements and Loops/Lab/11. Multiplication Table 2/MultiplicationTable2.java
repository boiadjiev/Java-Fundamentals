package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (m > 10) {
            System.out.printf("%d X %d = %d", n, m, n * m);
        } else {
            for (int i = m; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", n, i, n * i);
            }
        }
    }
}
