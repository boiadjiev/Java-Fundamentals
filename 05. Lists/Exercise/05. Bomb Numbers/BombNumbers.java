package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String element : input) {
            numbers.add(Integer.parseInt(element));
        }

        String[] specialAndPower = scanner.nextLine().split("\\s+", 2);
        int specialNumber = Integer.parseInt(specialAndPower[0]);
        int power = Integer.parseInt(specialAndPower[1]);

        while (numbers.contains(specialNumber)) {
            int index = numbers.indexOf(specialNumber);
            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);
    }
}
