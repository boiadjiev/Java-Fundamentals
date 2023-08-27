package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
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
                case "Add":
                    intList.add(Integer.parseInt(token[1]));
                    break;

                case "Remove":
                    intList.remove(Integer.valueOf(Integer.parseInt((token[1]))));
                    break;

                case "RemoveAt":
                    intList.remove(Integer.parseInt(token[1]));
                    break;

                case "Insert":
                    intList.add(Integer.parseInt(token[2]), Integer.parseInt(token[1]));
            }
            command = scanner.nextLine();
        }
        for (int element : intList) {
            System.out.print(element + " ");
        }
    }
}
