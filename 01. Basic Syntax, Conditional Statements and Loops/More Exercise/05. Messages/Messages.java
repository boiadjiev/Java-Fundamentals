package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfPush = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 0; i < numbersOfPush; i++) {
            String input = scanner.nextLine();
            int length = input.length();
            char digit = input.charAt(0);
            int mainDigit = Character.getNumericValue(digit);
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offset + length - 1;
            int letterCode = letterIndex + 97;


            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message += letter;

        }
        System.out.println(message);
    }
}
