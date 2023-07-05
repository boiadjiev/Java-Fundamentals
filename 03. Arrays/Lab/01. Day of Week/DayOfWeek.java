package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDay = Integer.parseInt(scanner.nextLine());
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (inputDay >= 1 && inputDay <= 7) {
            System.out.println(day[inputDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
