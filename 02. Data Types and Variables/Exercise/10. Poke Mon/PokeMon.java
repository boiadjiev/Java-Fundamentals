package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustion = Byte.parseByte(scanner.nextLine());

        int halfPokePower = pokePower / 2;
        int targetCount = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            targetCount++;

            boolean saveToDelete = exhaustion > 0;

            if (pokePower == halfPokePower && saveToDelete) {
                pokePower = pokePower / exhaustion;
            }
        }
        System.out.println(pokePower);
        System.out.println(targetCount);
    }
}
