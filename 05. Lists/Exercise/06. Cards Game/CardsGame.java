package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOne = scanner.nextLine().split("\\s+");
        List<Integer> playerOne = new ArrayList<>();

        String[] inputTwo = scanner.nextLine().split("\\s+");
        List<Integer> playerTwo = new ArrayList<>();

        for (String card : inputOne) {
            playerOne.add(Integer.parseInt(card));
        }

        for (String card : inputTwo) {
            playerTwo.add(Integer.parseInt(card));
        }

        while (!(playerOne.isEmpty() || playerTwo.isEmpty())) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);
            } else {
                playerOne.remove(0);
                playerTwo.remove(0);
            }
        }
        int sum = 0;
        if (playerOne.size() > playerTwo.size()) {
            for (int card : playerOne) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int card : playerTwo) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
