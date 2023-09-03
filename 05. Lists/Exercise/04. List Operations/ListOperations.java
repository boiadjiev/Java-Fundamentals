package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String element : input) {
            numbers.add(Integer.parseInt(element));
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(token[1]));
                    break;

                case "Insert":
                    int indexInsert = Integer.parseInt(token[2]);
                    int number = Integer.parseInt(token[1]);
                    if (indexInsert < numbers.size() && indexInsert >= 0) {
                        numbers.add(indexInsert, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int indexRemove = Integer.parseInt(token[1]);
                    if (indexRemove < numbers.size() && indexRemove >= 0) {
                        numbers.remove(Integer.parseInt(token[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    switch (token[1]) {
                        case "left":
                            for (int i = 0; i < Integer.parseInt(token[2]); i++) {
                                int temp = numbers.get(0);
                                for (int j = 0; j < numbers.size() - 1; j++) {
                                    numbers.set(j, numbers.get(j + 1));
                                }
                                numbers.set(numbers.size() - 1, temp);
                            }
                            break;

                        case "right":
                            for (int i = 0; i < Integer.parseInt(token[2]); i++) {
                                int temp = numbers.get(numbers.size() - 1);
                                for (int j = 0; j < numbers.size() - 1; j++) {
                                    numbers.set(numbers.size() - 1 - j, numbers.get(numbers.size() - 2 - j));
                                }
                                numbers.set(0, temp);
                            }
                            break;
                    }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
