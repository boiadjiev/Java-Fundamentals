package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double bestSnowball = 0;
        int bestSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowBall = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (currentSnowBall > bestSnowball) {
                bestSnowball = currentSnowBall;
                bestSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestSnowballTime, bestSnowball, bestSnowballQuality);
    }
}
