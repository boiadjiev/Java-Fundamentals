package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];

        for (int i = 0; i < n; i++) {
            String[] arrInput = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                arrOne[i] = Integer.parseInt(arrInput[0]);
                arrTwo[i] = Integer.parseInt(arrInput[1]);
            } else {
                arrOne[i] = Integer.parseInt(arrInput[1]);
                arrTwo[i] = Integer.parseInt(arrInput[0]);
            }
        }
        for (int i : arrOne) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arrTwo) {
            System.out.print(i + " ");
        }
    }
}
