package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder message = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            message.append((char) (currentChar + key));
        }

        System.out.println(message);
    }
}
