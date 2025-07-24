package Lab;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        System.out.print("Please enter the value of a:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if(a == 0)
        {
            if(a<b)
            {
                System.out.print("CCC");
            }
            System.out.print("AAA");
        }
        else if(a==b)
        {
            System.out.print("DDD");
        }
        else
        {
            if(b == 0)
            {
                System.out.print("BBB");
            }
        }
    }
}
