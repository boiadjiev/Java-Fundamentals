package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        short capacity = 255;
        short litersInTank = 0;

        for (int i = 1; i <= n; i++) {
            short water = Short.parseShort(scanner.nextLine());
            if (water > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                litersInTank += water;
                capacity -= water;
            }
        }
        System.out.println(litersInTank);
    }
}
