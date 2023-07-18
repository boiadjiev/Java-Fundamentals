package Arrays.Exercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = scanner.nextLine().split(" ");
        int[] arrInt = new int[arrInput.length];
        int currentLength = 1;
        int bestLength = 0;
        int digit = 0;

        for (int i = 0; i < arrInput.length; i++) {
            arrInt[i] = Integer.parseInt(arrInput[i]);
        }

        for (int i = 0; i < arrInt.length - 1; i++) {
            int currentElement = arrInt[i];
            int nextNum = arrInt[i + 1];

            if (currentElement == nextNum) {
                currentLength++;
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    digit = currentElement;
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
