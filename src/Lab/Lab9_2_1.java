package Lab;

import java.util.Scanner;

public class Lab9_2_1 {
    public static int labMethodQ1(int x, int y){
        int sum=0;
        if(x < 0 && y < 0){
            return 0;
        }
        sum = x + y;
        return sum;
    }
    public static void main(String[] args)
    {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1:");
        x = input.nextInt();
        System.out.print("Enter integer 2:");
        y = input.nextInt();
        System.out.println(labMethodQ1(x, y));
    }
}
