package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int brackets = 0;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            if (line.equals("(")) {
                brackets++;
                if (brackets > 1) {
                    break;
                }
            } else if (line.equals(")")) {
                brackets--;
                if (brackets < 0) {
                    break;
                }
            }
        }
        System.out.println((brackets == 0) ? "BALANCED" : "UNBALANCED");
    }
}
