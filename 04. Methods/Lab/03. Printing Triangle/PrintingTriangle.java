package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        printTriangle(size);
    }
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printLine(1, i);
        }

        printLine(1, size);

        for (int i = size - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
