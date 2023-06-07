package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }
                break;

            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
        }
        double totalPrice = people * price;

        if (type.equals("Students") && people >= 30) {
            totalPrice *= 0.85;
        }
        if (type.equals("Business") && people >= 100) {
            totalPrice -= 10 * price;
        }
        if (type.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
