package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursInput = Integer.parseInt(scanner.nextLine());
        int minutesInput = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hoursInput * 60 + minutesInput + 30;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        if (hours == 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
