package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = lostGameCount / 2;
        int mouse = lostGameCount / 3;
        int keyboard = lostGameCount / 6;
        int display = 0;

        for (int i = 1; i <= keyboard; i++) {
            if (i % 2 == 0) {
                display++;
            }
        }

        double expenses =  headset * headsetPrice + mouse * mousePrice + keyboard * keyboardPrice + display * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
