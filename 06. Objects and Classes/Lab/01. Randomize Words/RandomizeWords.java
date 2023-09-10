package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        randomizeElements(input);
        printResult(input);
    }
    private static void randomizeElements (String[] array) {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndex = rnd.nextInt(array.length);

            String temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
    private static void printResult (String[] strings) {
        for (String element : strings) {
            System.out.println(element);
        }
    }
}
