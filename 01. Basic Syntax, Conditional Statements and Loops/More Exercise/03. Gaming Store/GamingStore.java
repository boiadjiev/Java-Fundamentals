package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double balanceOrigin = balance;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            double gamePrice = gamePrice(input);

            if (gamePrice > 0) {
                if (balance - gamePrice < 0) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.printf("Bought %s\n", input);
                    balance -= gamePrice;
                }
                if (balance == 0) {
                    System.out.println("Out of money!");
                    return;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", balanceOrigin - balance, balance);
    }

    private static double gamePrice(String gameName) {
        double gamePrice = 0;

        switch (gameName) {
            case "OutFall 4":
            case "RoverWatch Origins Edition":
                gamePrice = 39.99;
                break;
            case "CS: OG":
                gamePrice = 15.99;
                break;
            case "Zplinter Zell":
                gamePrice = 19.99;
                break;
            case "Honored 2":
                gamePrice = 59.99;
                break;
            case "RoverWatch":
                gamePrice = 29.99;
                break;
            default:
                System.out.println("Not Found");
        }
        return gamePrice;
    }
}
