package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String out = "";

        if (age >= 66) {
            out = "elder";
        } else if (age >= 20) {
            out = "adult";
        } else if (age >= 14) {
            out = "teenager";
        } else if (age >= 3) {
            out = "child";
        } else if (age >= 0) {
            out = "baby";
        }
        System.out.println(out);
    }
}
