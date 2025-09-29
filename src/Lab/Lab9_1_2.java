package Lab;

import java.util.Scanner;

public class Lab9_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String method = "other";
        double result = 0;
        boolean firstRun = true;
        while(!method.equalsIgnoreCase("exit")) {
            System.out.print("Enter number: ");
            double number = sc.nextDouble();
            method = method.toLowerCase();
            if (!firstRun) {
                result = switch (method) {
                    case "add" -> add(result, number);
                    case "subtract" -> subtract(result, number);
                    case "multiply" -> multiply(result, number);
                    case "divide" -> divide(result, number);
                    default -> result;
                };
                System.out.println("Currently, num = " + result);
            } else {
                result = number;
                firstRun = false;
            }
            System.out.print("Enter a word (add,subtract,multiply,divide,exit): ");
            method = sc.next();
        }
        System.out.print("Currently, num = " + result);
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static double subtract(double x, double y) {
        return x - y;
    }
    private static double multiply(double x, double y) {
        return x * y;
    }
    private static double divide(double x, double y) {
        return x / y;
    }
}
