package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordersCount = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double coffeePrice = days * capsuleCount * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f\n", coffeePrice);
            total += coffeePrice;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
