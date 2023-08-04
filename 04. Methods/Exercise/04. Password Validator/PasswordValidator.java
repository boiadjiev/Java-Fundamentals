package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean passValid = true;

        if (!checkLength(input)) {
            passValid = false;
        }
        if (!checkSymbols(input)) {
            passValid = false;
        }
        if (!checkDigitsCount(input)) {
            passValid = false;
        }
        if (passValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkLength(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    private static boolean checkSymbols(String input) {
        boolean isLegal = false;

        for (int i = 0; i < input.length(); i++) {
            int letter = input.charAt(i);

            if (letter >= 48 && letter <= 57) {
                isLegal = true;
            } else if (letter >= 65 && letter <= 90) {
                isLegal = true;
            } else if (letter >= 97 && letter <= 122) {
                isLegal = true;
            } else {
                isLegal = false;
                break;
            }
        }

        if (!isLegal) {
            System.out.println("Password must consist only of letters and digits");
            return false;
        } else {
            return true;
        }
    }

    private static boolean checkDigitsCount(String input) {
        int digitsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentChar = input.charAt(i);
            if (currentChar >= 48 && currentChar <= 57) {
                digitsCount++;
            }
        }
        if (digitsCount < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        } else {
            return true;
        }
    }
}
