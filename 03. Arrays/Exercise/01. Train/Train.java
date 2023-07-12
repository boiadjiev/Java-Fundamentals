package Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];
        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i : wagons) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.print(sum);
    }
}
