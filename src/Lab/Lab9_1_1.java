package Lab;

import java.util.Scanner;

public class Lab9_1_1 {

    public static double power(double number) {
        return Math.pow(2.0, number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        System.out.println("Power of " + num + " is " + power(num));
    }
}
