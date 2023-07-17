package Arrays.Exercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = scanner.nextLine().split(" ");
        int[] arrInt = new int[arrInput.length];
        boolean isEqual = false;
        int index = 0;

        for (int i = 0; i < arrInput.length; i++) {
            arrInt[i] = Integer.parseInt(arrInput[i]);
        }

        for (int i = 0; i < arrInt.length; i++) {

            int sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arrInt[j];
            }
            int sumRight = 0;
            for (int j = i + 1; j < arrInt.length; j++) {
                sumRight += arrInt[j];
            }

            if (sumLeft == sumRight) {
                isEqual = true;
                index = i;
                break;
            }
        }
        if (isEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
