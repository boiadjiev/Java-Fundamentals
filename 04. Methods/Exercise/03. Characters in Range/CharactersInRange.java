package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char charOne = scanner.nextLine().charAt(0);
        char charTwo = scanner.nextLine().charAt(0);

        if (charOne < charTwo) {
            printCharactersBetween(charOne, charTwo);
        } else {
            printCharactersBetween(charTwo, charOne);
        }
    }

    private static void printCharactersBetween(char start, char end) {
        for (char i = ++start; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
