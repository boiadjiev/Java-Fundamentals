package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = "";

        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed;
        }
        System.out.println(reversed);
    }
}
