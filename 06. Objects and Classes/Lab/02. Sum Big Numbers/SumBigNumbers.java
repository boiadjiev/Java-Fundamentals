package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firsNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        printResult(sumBigInteger(firsNumber, secondNumber));
    }
    private static BigInteger sumBigInteger(BigInteger firstNum, BigInteger secondNum) {
        return firstNum.add(secondNum);
    }
    private static void printResult(BigInteger num) {
        System.out.println(num);
    }
}
