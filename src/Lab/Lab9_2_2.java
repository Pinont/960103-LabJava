package Lab;

import java.util.Scanner;

public class Lab9_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(num + " is " + oddEven(num));
    }

    private static String oddEven(int number) {
        return number % 2 == 0 ? "EVEN" : "ODD";
    }
}
