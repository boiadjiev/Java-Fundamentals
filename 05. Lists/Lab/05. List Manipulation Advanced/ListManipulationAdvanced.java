package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> intList = new ArrayList<>();

        for (String element : input) {
            intList.add(Integer.parseInt(element));
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] token = command.split(" ");

            switch (token[0]) {
                case "Contains":
                    System.out.println(intList.contains(Integer.parseInt(token[1])) ? "Yes" : "No such number");
                    break;

                case "Print":
                    if (token[1].equals("even")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) % 2 == 0) {
                                System.out.print(intList.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;
                    } else if (token[1].equals("odd")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) % 2 != 0) {
                                System.out.print(intList.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }

                case "Get":
                    int sum = 0;
                    for (int i = 0; i < intList.size(); i++) {
                        sum += intList.get(i);
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    switch (token[1]) {
                        case "<":
                            for (int number : intList) {
                                if (number < Integer.parseInt(token[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">":
                            for (int number : intList) {
                                if (number > Integer.parseInt(token[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">=":
                            for (int number : intList) {
                                if (number >= Integer.parseInt(token[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "<=":
                            for (int number : intList) {
                                if (number <= Integer.parseInt(token[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                    }
            }
            command = scanner.nextLine();
        }
    }
}
