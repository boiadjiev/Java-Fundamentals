package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>();
        String[] strings = scanner.nextLine().split(" ");

        for (String string : strings) {
            Double number = Double.parseDouble(string);
            numbers.add(number);
        }

        int index = 0;
        while (index < numbers.size() - 1) {
            double currentElement = numbers.get(index);
            double nextElement = numbers.get(index + 1);

            if (currentElement == nextElement) {
                double sum = currentElement + nextElement;
                numbers.set(index, sum);
                numbers.remove(index + 1);
                index = 0;
            } else {
                index++;
            }
        }
        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
