package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputChar = scanner.nextLine();

        if (inputChar == inputChar.toUpperCase()) {
            System.out.println("upper-case");
        } else if (inputChar == inputChar.toLowerCase()) {
            System.out.println("lower-case");
        }
    }
}
