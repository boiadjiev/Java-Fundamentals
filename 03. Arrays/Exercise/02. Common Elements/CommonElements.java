package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (String elementOne : arrTwo) {
            for (String elementTwo : arrOne) {
                if (elementOne.equals(elementTwo)) {
                    System.out.print(elementOne + " ");
                }
            }
        }
    }
}
