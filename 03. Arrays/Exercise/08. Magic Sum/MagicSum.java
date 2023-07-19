package Arrays.Exercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] intArr = new int[inputArr.length];
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {
            intArr[i] = Integer.parseInt(inputArr[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] + intArr[j] == number) {
                    System.out.println(intArr[i] + " " + intArr[j]);
                }
            }
        }
    }
}
