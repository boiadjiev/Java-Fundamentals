package Arrays.Exercise;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayInput = scanner.nextLine().split(" ");
        int[] arrayInt = new int[arrayInput.length];

        for (int i = 0; i < arrayInput.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayInput[i]);
        }

        for (int i = 0; i < arrayInt.length - 1; i++) {
            boolean isBigger = true;
            int currentNum = arrayInt[i];

            for (int j = i + 1; j < arrayInt.length; j++) {
                int firstToTheRight = arrayInt[j];
                if (currentNum <= firstToTheRight) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(arrayInput[arrayInput.length - 1]);
    }
}
