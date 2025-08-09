package Lab;

import java.util.Scanner;

public class Lab04 {
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
        }
    }

    private static void q1(Scanner input) {
        char c = '0';
        int odd = 0;
        int even = 0;
        while (Character.toUpperCase(c) != 'Z') {
//            System.out.print(c + ": ");
            int num = Character.getNumericValue(c);
//            System.out.print(num + "\n");
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.print("Enter an Integer (or 'Z' to stop): ");
            c = input.next().charAt(0);
        }
        System.out.println("Sum of Odd Numbers: " + odd + "\nSum of Even Numbers: " + even);
    }

    private static void q2(Scanner input) {
        final String stick = "------";
        final int p1 = 1;
        final int p2 = 2;
        boolean player = false; // F = p1, T = p2; player = !player -> switch player
        boolean loser = false;
        int p1Picked = 0;
        int p2Picked = 0;
        boolean stick1 = true;
        boolean stick2 = true;
        boolean stick3 = true;
        boolean stick4 = true;
        boolean stick5 = true;
        boolean all = true;
        while (!(!all || !stick3)) {
            System.out.println("Stick on the table");
            System.out.println(stick1? "1: " + stick : "1:");
            System.out.println(stick2? "2: " + stick : "2:");
            System.out.println("3: " + stick); // simplified true -> Jetbrains Suggest
            System.out.println(stick4? "4: " + stick : "4:");
            System.out.println(stick5? "5: " + stick : "5:");
            System.out.println("The " + (player? p2 : p1) + " player turn");
            System.out.print("Please choose the stick number: ");
            int pos = input.nextInt();
            switch (pos) {
                case 1:
                    if (!stick1) {
                        System.out.println("That stick is already picked, please try another");
                        continue;
                    }
                    stick1 = false;
                    break;
                case 2:
                    if (!stick2) {
                        System.out.println("That stick is already picked, please try another");
                        continue;
                    }
                    stick2 = false;
                    break;
                case 3:
                    stick3 = false;
                    break;
                case 4:
                    if (!stick4) {
                        System.out.println("That stick is already picked, please try another");
                        continue;
                    }
                    stick4 = false;
                    break;
                case 5:
                    if (!stick5) {
                        System.out.println("That stick is already picked, please try another");
                        continue;
                    }
                    stick5 = false;
                    break;
                default:
                    System.out.println("Invalid Input, please enter it again");
                    continue;
            }
            if (player) {
                p1Picked++;
            } else {
                p2Picked++;
            }
            loser = player;
            player = !player;
            all = stick1 || stick2 || stick3 || stick4 || stick5; // update "all" var
        }
        int round = (p1Picked + p2Picked) / 2;
        System.out.println("The Winner is player " + (player? p2: p1));
        System.out.println("The loser is player " + (loser? p2: p1));
        System.out.println("The total rounds " + round);
        System.out.println("player 1 picked " + p1Picked + " stick(s)");
        System.out.println("player 2 picked " + p2Picked + " stick(s)");
    }
}