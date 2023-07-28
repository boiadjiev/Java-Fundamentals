package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String resultString = repeatString(inputString, count);
        System.out.println(resultString);
    }

    private static String repeatString(String inputString, int count) {
        String[] resultString = new String[count];
        for (int i = 0; i < resultString.length; i++) {
            resultString[i] = inputString;
        }
        return String.join("", resultString);
    }
}
