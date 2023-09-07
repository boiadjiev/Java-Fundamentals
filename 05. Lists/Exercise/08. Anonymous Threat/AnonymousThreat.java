package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<String> strings = new ArrayList<>();

        for (String element : input) {
            strings.add(element);
        }

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(token[1]);
                    int endIndex = Integer.parseInt(token[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > strings.size() - 1) {
                        endIndex = strings.size() - 1;
                    }
                    int counter = startIndex;

                    for (int i = startIndex; i < endIndex; i++) {
                        String merged = strings.get(counter) + strings.get(counter + 1);
                        strings.set(counter, merged);
                        strings.remove(counter + 1);
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(token[1]);
                    int partitions = Integer.parseInt(token[2]);

                    if (index >= 0 && index < strings.size() && partitions >= 0 && partitions <= 100) {
                        String element = strings.get(index);
                        List<String> newList = new ArrayList<>();

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    merged += symbol;
                                    count++;
                                }
                                newList.add(merged);
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String merged = "";

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        merged += symbol;
                                        count++;
                                    }
                                }
                                newList.add(merged);
                            }
                        }
                        strings.remove(index);
                        strings.addAll(index, newList);
                    }

                    break;
            }

            command = scanner.nextLine();
        }
        for (String element : strings) {
            System.out.print(element + " ");
        }
    }
}
