package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String[] numbers = scanner.nextLine().split(" ");

        for (String num : numbers) {
            if (Integer.parseInt(num) % 2 == 0) {
                sum += Integer.parseInt(num);
            }
        }
        System.out.println(sum);
    }
}
