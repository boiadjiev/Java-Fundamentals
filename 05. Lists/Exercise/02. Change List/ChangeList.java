package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split("\\s+");
        List<Integer> intList = new ArrayList<>();

        for (String element : inputString) {
            intList.add(Integer.parseInt(element));
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] token = command.split("\\s+");
            int element = Integer.parseInt(token[1]);
            switch (token[0]) {
                case "Delete":
                    while (intList.remove(Integer.valueOf(element))) {
                        intList.remove(Integer.valueOf(element));
                    }
                    break;

                case "Insert":
                    int position = Integer.parseInt(token[2]);
                    intList.add(position, element);
            }
            command = scanner.nextLine();
        }
        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }
}
