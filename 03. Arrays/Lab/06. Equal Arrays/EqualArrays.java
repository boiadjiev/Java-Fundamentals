package Arrays.Lab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (!arrOne[i].equals(arrTwo[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            } else {
                sum+= Integer.parseInt(arrOne[i]);
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
