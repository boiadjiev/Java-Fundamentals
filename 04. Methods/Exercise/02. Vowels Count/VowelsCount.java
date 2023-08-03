package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        vowelsCount(input);
    }

    private static void vowelsCount(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'i' || letter == 'e' || letter == 'y') {
                count++;
            }
        }
        System.out.println(count);
    }
}
