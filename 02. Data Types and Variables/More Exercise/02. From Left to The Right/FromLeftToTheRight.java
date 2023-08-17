package DataTypesAndVariables.MoreExercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            BigDecimal a = new BigDecimal(numbers[0]);
            BigDecimal b = new BigDecimal(numbers[1]);

            if (a.compareTo(b) > 0) {
                System.out.println(sumDigits(numbers[0]));
            } else {
                System.out.println(sumDigits(numbers[1]));
            }
        }
    }

    private static BigInteger sumDigits(String number) {
        BigInteger num = new BigInteger(number.replaceAll("[-.]", ""));
        BigInteger sum = new BigInteger("0");

        while (!num.equals(new BigInteger("0"))) {
            BigInteger[] result = num.divideAndRemainder(new BigInteger("10"));
            sum = sum.add(result[1]);
            num = result[0];
        }
        return sum;
    }
}
