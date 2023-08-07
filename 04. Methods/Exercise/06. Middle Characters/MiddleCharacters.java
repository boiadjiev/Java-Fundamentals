package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            System.out.println(input.substring(input.length() / 2 - 1, input.length() / 2 + 1));
        } else {
            System.out.println(input.substring(input.length() / 2, input.length() / 2 + 1));
        }
    }
}
