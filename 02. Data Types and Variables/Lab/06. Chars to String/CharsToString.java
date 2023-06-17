package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";

        for (int i = 1; i <= 3; i++) {
            string += scanner.nextLine().charAt(0);
        }

        System.out.println(string);
    }
}
