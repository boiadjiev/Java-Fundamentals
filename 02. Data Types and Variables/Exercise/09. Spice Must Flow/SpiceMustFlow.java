package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        short daysCount = 0;
        int spiceExtracted = 0;

        while (startingYield >= 100) {
            int currentSpice = startingYield - 26;
            spiceExtracted += currentSpice;
            startingYield -= 10;
            daysCount++;

            if (startingYield < 100) {
                spiceExtracted -= 26;
            }
        }
        System.out.println(daysCount);
        System.out.println(spiceExtracted);
    }
}
