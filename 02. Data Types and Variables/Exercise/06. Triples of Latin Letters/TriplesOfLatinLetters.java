package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                for (int i3 = 0; i3 < n; i3++) {

                    char firstChar = (char)('a' + i1);
                    char secondChar = (char)('a' + i2);
                    char thirdChar = (char)('a' + i3);

                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
