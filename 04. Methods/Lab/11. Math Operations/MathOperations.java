package Methods.Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firsNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculate(firsNumber, operator, secondNumber));
    }
    private static double calculate(double firstNumber, String operator, double secondNumber) {
        double result = 0;
        switch (operator) {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
        }
        return result;
    }
}
