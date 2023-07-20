package Arrays.Exercise;

import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        int[] intArr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            intArr[i] = Integer.parseInt(inputArr[i]);
        }

        String[] inputCommand = scanner.nextLine().split("\\s");
        String command = inputCommand[0];

        while (!command.equals("end")) {

            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(inputCommand[1]);
                    int index2 = Integer.parseInt(inputCommand[2]);
                    int temp = intArr[index1];
                    intArr[index1] = intArr[index2];
                    intArr[index2] = temp;
                    break;

                case "multiply":
                    index1 = Integer.parseInt(inputCommand[1]);
                    index2 = Integer.parseInt(inputCommand[2]);
                    intArr[index1] = intArr[index1] * intArr[index2];
                    break;

                case "decrease":
                    for (int i = 0; i < intArr.length; i++) {
                        intArr[i] = intArr[i] - 1;
                    }
                    break;
            }
            inputCommand = scanner.nextLine().split("\\s");
            command = inputCommand[0];
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
