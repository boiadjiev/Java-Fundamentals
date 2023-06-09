package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentCount / 6;
        double sabers = Math.ceil(studentCount * 1.1) * saberPrice;
        double robes = robePrice * studentCount;
        double belts = beltPrice * studentCount - beltPrice * freeBelts;

        double price = sabers + robes + belts;

        if (price <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", price);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", price - money);
        }
    }
}
