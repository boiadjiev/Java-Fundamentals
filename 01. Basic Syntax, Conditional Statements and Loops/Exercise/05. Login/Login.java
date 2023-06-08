package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String inputPass = scanner.nextLine();
        String password = "";
        int count = 0;
        boolean isBlocked = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i) + "";
        }
        while (!inputPass.equals(password)) {
            count++;
            if (count == 4) {
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            inputPass = scanner.next();
        }
        if (isBlocked) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
