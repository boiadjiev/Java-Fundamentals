package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(nameOne + delimiter + nameTwo);
    }
}
