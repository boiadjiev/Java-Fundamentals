package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> numbers = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] inputElement = input[i].split("\\s+");
            for (String element : inputElement) {
                if (!element.equals("")) {
                    numbers.add(element);
                }
            }
        }
        System.out.println(String.join(" ", numbers));
    }
}
