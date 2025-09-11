package Lab;

import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        q5();
    }

    private static void q1() {
        String[] name = {"New", "Tao", "Boom", "View", "Prang"};
        System.out.println("The most lucky student is " + name[0] + ".");
        System.out.println("The most handsome student is " + name[1] + ".");
        System.out.println("The most beautiful student is " + name[2] + ".");
        System.out.println("The most funny student is " + name[3] + ".");
        System.out.println("The most tallest student is " + name[4] + ".");
    }

    private static void q2() {
        Scanner input = new Scanner(System.in);
        double[] doubleArray = new double[10];
        System.out.print("Enter 10 set of number: ");
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }
        System.out.print("Enter one more number: ");
        double oneMore = input.nextDouble();
        boolean isIn = false;
        for (int i = 0; i < 10; i++) {
            if (doubleArray[i] == oneMore) {
                isIn = true;
                break;
            }
        }
        if (isIn) {
            System.out.println(oneMore + " is in array.");
        } else {
            System.out.println(oneMore + " is not in array.");
        }
    }

    private static void q3() {
        Scanner input = new Scanner(System.in);
        double[] tempArray = new double[15];
        double[] doubleArray = new double[15];
        System.out.print("Enter 15 set of number: ");
        for (int i = 0; i < 15; i++) {
            doubleArray[i] = input.nextDouble();
            tempArray[i] = doubleArray[i];
        }
        boolean change = true;
        while (change) {
            System.out.print("Do you want to change the array values? (y/n): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("y")) {
                System.out.print("Enter array values: ");
                double val = input.nextDouble();
                System.out.print("Enter array index: ");
                int index = input.nextInt();
                if (index >= 0 && index <= 15) {
                    doubleArray[index] = val;
                } else {
                    System.out.println("Invalid index, Please try again.");
                    continue;
                }
                System.out.println("Array values changed.");
                System.out.print("The old one: [ ");
                for (int i = 0; i < 15; i++) {
                    System.out.print(tempArray[i] + " ");
                }
                System.out.print(" ]\nThe new one: [ ");
                for (int i = 0; i < 15; i++) {
                    System.out.print(doubleArray[i] + " ");
                    tempArray[i] = doubleArray[i];
                }
                System.out.print("]\n");
            } else if (choice.equalsIgnoreCase("n")) {
                change = false;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void q4() {
        Scanner input = new Scanner(System.in);
        String[] studentsName = new String[5];
        int[] studentHeight = new int[5];
        int[] maxHeight = {0, 0}; // 0: index, 1: height
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            studentsName[i] = input.nextLine();
            System.out.print("Enter student height: ");
            studentHeight[i] = input.nextInt();
            input.nextLine();
            if (maxHeight[1] < studentHeight[i]) {
                maxHeight[1] = studentHeight[i];
                maxHeight[0] = i;
            }
        }
        System.out.print("The tallest student is " + studentsName[maxHeight[0]] + ", height: " + maxHeight[1] + ".");
    }

    private static void q5() {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 5, 9, 11, 12, 13, 14, 15, 19, 22};
        int[] temp_numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            temp_numbers[i] = numbers[i];
        }
        System.out.print("\nEnter number to insert: ");
        int number = input.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (found) {
                numbers[i] = temp_numbers[i-1];
            } else if (numbers[i] >= number) {
                numbers[i] = number;
                found = true;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
