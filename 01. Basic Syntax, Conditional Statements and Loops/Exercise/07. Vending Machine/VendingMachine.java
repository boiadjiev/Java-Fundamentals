package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCoins = scanner.nextLine();
        double sum = 0;

        while (!inputCoins.equals("Start")) {
            double coins = Double.parseDouble(inputCoins);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            inputCoins = scanner.nextLine();
        }

        String product = scanner.nextLine();
        boolean boughtItem = false;
        double price = 0;

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    price = 2;
                    boughtItem = true;
                    break;
                case "Water":
                    price = 0.7;
                    boughtItem = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    boughtItem = true;
                    break;
                case "Soda":
                    price = 0.8;
                    boughtItem = true;
                    break;
                case "Coke":
                    price = 1;
                    boughtItem = true;
            }
            if (price > sum) {
                System.out.println("Sorry, not enough money");
            } else if (boughtItem) {
                sum -= price;
                System.out.printf("Purchased %s\n", product);
            } else {
                System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
