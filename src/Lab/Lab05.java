package Lab;

import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the quiz number : ");
        int n = s.nextInt();
        switch (n) {
            case 1:
                q1();
                break;
            case 2:
                q2();
                break;
            case 3:
                q3();
                break;
            case 4:
                q4();
                break;
            case 5:
                q5();
                break;
        }
    }

    private static void q1() {
        for (int i = 0; i < 100; i = i + 8) {
            System.out.println("i = " + i);
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to add: ");
        int N = sc.nextInt();
        int largestNumber = 0;
        String evenNumber = "";
        String primeNumber = "";
        System.out.println("Please enter the number:");
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (largestNumber < number) {
                largestNumber = number;
            }
            if (number % 2 == 0) {
                evenNumber += number + " ";
            }
            boolean isPrime = true;
            for (int p = 2; p < number; p++) {
                if (number % p == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumber += number + " ";
            }
        }
        System.out.println(
                "Even number is " + evenNumber + "\n" + "Prime number is " + primeNumber + "\n" + "Largest number is " + largestNumber
        );
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        System.out.print("Please enter 3 a number: ");
        for (int i = 0; i < 3; i++) {
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Invalid input, Number should be positive");
                i--;
                continue;
            }
            if (i == 0) {
                num1 = number;
            } else if (i == 1) {
                num2 = number;
            } else {
                num3 = number;
            }
        }

        // bubble sort method
        int temp;
        if (num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp; // num3
        }
        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp; // num2
        }
        if (num2 > num3) { // recheck
            temp = num3;
            num3 = num2;
            num2 = temp; // num3
        }

        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int rows = n;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 1; j <= rows; j++) {
                if (j >= temp) {
                    char character = (char) ('A' + c);
                    System.out.print(character);
                    if (j >= n) {
                        c--;
                    } else {
                        c++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            temp--;
            rows++;
        }
    }

}
