package Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> intList = new ArrayList<>();

        for (String element : input) {
            int number = Integer.parseInt(element);
            if (number >= 0) {
                intList.add(number);
            }
        }

        Collections.reverse(intList);

        if (intList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(intList.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
