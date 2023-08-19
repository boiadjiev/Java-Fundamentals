package DataTypesAndVariables.MoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scanner.nextLine());
        BigDecimal b = new BigDecimal(scanner.nextLine());

        BigDecimal difference = a.subtract(b).abs();

        if (new BigDecimal("0.000001").compareTo(difference) > 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
