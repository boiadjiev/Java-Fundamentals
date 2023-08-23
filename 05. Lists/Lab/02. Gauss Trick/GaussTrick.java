package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        List<Integer> modified = new ArrayList<>();
        String[] strings = scanner.nextLine().split(" ");

        for (String string : strings) {
            numbers.add(Integer.parseInt(string));
        }

        for (int i = 0; i < numbers.size() / 2; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
            modified.add(sum);
        }

        if (numbers.size() % 2 != 0) {
            int middleIndex = numbers.size() / 2;
            modified.add(numbers.get(middleIndex));
        }

        for (int number : modified) {
            System.out.print(number + " ");
        }
    }
}
