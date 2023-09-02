package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();
        int commandCounts = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandCounts; i++) {
            String[] token = scanner.nextLine().split("\\s+", 2);
            String name = token[0];
            switch (token[1]) {
                case "is going!":
                    if (guestList.contains(name)) {
                        System.out.println(name + " is already in the list!");
                    } else {
                        guestList.add(name);
                    }
                    break;

                case "is not going!":
                    if (guestList.contains(name)) {
                        guestList.remove(name);
                    } else {
                        System.out.println(name + " is not in the list!");
                    }
            }
        }
        for (String element : guestList) {
            System.out.println(element);
        }
    }
}
