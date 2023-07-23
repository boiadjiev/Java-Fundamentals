package Methods.Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double grade = Double.parseDouble(scanner.nextLine());
        printGrade(grade);
    }
    private static void printGrade (Double grade) {
        String gradeType = "";
        if (grade < 6.00 && grade >= 5.50) {
            gradeType = "Excellent";
        } else if (grade >= 4.50) {
            gradeType = "Very good";
        } else if (grade >= 3.50) {
            gradeType = "Good";
        } else if (grade >= 3.00) {
            gradeType = "Poor";
        } else if (grade >= 2.00) {
            gradeType = "Fail";
        }
        System.out.println(gradeType);
    }
}
