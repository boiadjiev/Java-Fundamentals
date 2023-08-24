package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (String element : firstInput) {
            first.add(Integer.parseInt(element));
        }

        for (String element : secondInput) {
            second.add(Integer.parseInt(element));
        }

        int minLength = Math.min(first.size(), second.size());

        for (int i = 0; i < minLength; i++) {
            result.add(first.get(i));
            result.add(second.get(i));
        }

        for (int i = minLength; i < first.size(); i++) {
            result.add(first.get(i));
        }

        for (int i = minLength; i < second.size(); i++) {
            result.add(second.get(i));
        }

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
