package Lab;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the quiz number : ");
        int n = s.nextInt();
        switch (n) {
            case 1:
                q1(s);
                break;
            case 2:
                q2(s);
                break;
            case 3:
                q3(s);
                break;
            case 4:
                q4(s);
                break;
        }
    }


    private static void q1(Scanner input) { // if-else condition
        System.out.println("what is your age ?");
        System.out.print("Answer ");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You are not allowed to apply for a driving license");
        } else {
            System.out.println("You are an adult. What is your name ?");
            System.out.print("My name is ");
            String name = input.next();
            System.out.println("That's is a very good name :), " + name);
        }
        System.out.println("The end of the program");
    }

    private static void q2(Scanner input) { // Attendance checker
        System.out.print("Amount of class? ");
        int amountOfClass = input.nextInt();
        System.out.print("Amount of time do you late for the class? ");
        int late = input.nextInt();
        System.out.print("Amount of time do you absent for the class? ");
        int absent = input.nextInt();
        double percent = 100 - (((double) (late + absent) / amountOfClass) * 100);
        if (percent >= 80) {
            System.out.println("The student can take the exam");
        } else {
            System.out.println("The student cannot take the exam");
        }
    }

    private static void q3(Scanner input) { // GPA Calculator
        System.out.print("Amount of subject? ");
        int amountOfSubject = input.nextInt();
        double totalCredits = 0;
        double totaCourseScore = 0;
        for (int i = 0; i < amountOfSubject; i++) {
            System.out.print("The course credit? ");
            double credit = input.nextInt();
            System.out.print("The course grade is? ");
            char grade = input.next().charAt(0);
            double gradePoints = getGradePoints(grade);
            totalCredits += credit;
            totaCourseScore += gradePoints * credit;
        }
        System.out.println("The GPA is " + (totaCourseScore / totalCredits));
    }

    private static double getGradePoints(char c) {
        return switch (c) {
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            case 'F' -> 0.0;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }

    private static void q4(Scanner input) { // Shop Discount
        System.out.print("What's your membership status (Silver, Gold and No)? ");
        String membershipStatus = input.next();
        System.out.print("The amount of money to spend? ");
        double money = input.nextInt();
        if (!(membershipStatus.equalsIgnoreCase("Silver") || membershipStatus.equalsIgnoreCase("Gold"))) {
            System.out.print("No discount is applied to non-membership.");
        } else {
            double discountAmount = discountPercent(membershipStatus, money);
            System.out.println("The discount is " + (discountAmount * 100) + "%, discount ammount: " + (money - (money *  discountAmount)));
        }
    }

    private static double discountPercent(String membershipStatus, double money) {
        boolean gold = membershipStatus.equalsIgnoreCase("Gold"); // gold = 1, silver = 0;
        if (money > 10000) {
            if (gold) {
                return 0.1;
            } else {
                return 0.05;
            }
        } else if (money >= 1000) {
            if (gold) {
                return 0.08;
            } else {
                return 0.03;
            }
        } else {
            if (gold) {
                return 0.05;
            } else {
                return 0.02;
            }
        }
    }
}
