package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split(", ");
        List<String> lesson = new ArrayList<>();
        for (String element : input) {
            lesson.add(element);
        }
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] token = command.split(":");
            switch (token[0]) {
                case "Add":
                    if (!lesson.contains(token[1])) {
                        lesson.add((token[1]));
                    }
                    break;
                case "Insert":
                    if (!lesson.contains(token[1])) {
                        int index = Integer.parseInt(token[2]);
                        if (index >= 0 && index < lesson.size()) {
                            lesson.add(index, token[1]);
                        }
                    }
                    break;
                case "Remove":
                    lesson.remove(token[1]);
                    String ex = token[1] + "-Exercise";
                    lesson.remove(ex);
                    break;
                case "Swap":
                    String exOne = token[1] + "-Exercise";
                    String exTwo = token[2] + "-Exercise";
                    if (lesson.contains(token[1]) && lesson.contains(token[2])) {
                        String firstElement = token[1];
                        int firstIndex = lesson.indexOf(token[1]);
                        String secondElement = token[2];
                        int secondIndex = lesson.indexOf(token[2]);
                        lesson.set(firstIndex, secondElement);
                        lesson.set(secondIndex, firstElement);
                        if (lesson.contains(exOne)) {
                            lesson.remove(lesson.indexOf(exOne));
                            lesson.add(lesson.indexOf(token[1]) + 1, exOne);
                        }
                        if (lesson.contains(exTwo)) {
                            lesson.remove(lesson.indexOf(exTwo));
                            lesson.add(lesson.indexOf(token[2]) + 1, exTwo);
                        }
                    }
                    break;
                case "Exercise":
                    String ex1 = token[1] + "-Exercise";
                    if (!lesson.contains(token[1])) {
                        lesson.add(token[1]);
                        lesson.add(ex1);
                    } else if (lesson.contains(token[1]) && !lesson.contains(ex1)) {
                        lesson.add(lesson.indexOf(token[1]) + 1, ex1);
                    }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < lesson.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lesson.get(i));
        }
    }
}
