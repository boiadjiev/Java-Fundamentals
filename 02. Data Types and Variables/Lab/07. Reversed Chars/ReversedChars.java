package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";

        for (int i = 0; i < 3; i++) {
            inputStr += scanner.nextLine().charAt(0);
        }

        for (int i = 2; i >= 0; i--) {
            System.out.print(inputStr.charAt(i) + " ");
        }
    }
}
