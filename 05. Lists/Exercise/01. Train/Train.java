package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] passengersInput = scanner.nextLine().split(" ");
        int capacity = Integer.parseInt(scanner.nextLine());

        List<Integer> wagon = new ArrayList<>();

        for (String element : passengersInput) {
            wagon.add(Integer.parseInt(element));
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] token = command.split(" ");
            if (token[0].equals("Add")) {
                wagon.add(Integer.parseInt(token[1]));
            } else {
                for (int i = 0; i < wagon.size(); i++) {
                    int passengers = wagon.get(i);
                    int sumPassengers = passengers + Integer.parseInt(token[0]);
                    if (sumPassengers <= capacity){
                        wagon.set(i, sumPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
