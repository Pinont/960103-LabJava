package Lab;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        q2();
    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student to be store: ");
        int n = sc.nextInt();
        String[] students = new String[n];
        double[][] weightHeight = new double[n][n + 1]; // i,0 = weight, i,1 = height;
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            students[i] = sc.next();
            System.out.print("Student " + (i + 1) + " weight: ");
            double weight = sc.nextDouble();
            System.out.print("Student " + (i + 1) + " height: ");
            double height = sc.nextDouble();
            weightHeight[i][0] = weight;
            weightHeight[i][1] = height;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Student Name: " + students[i] + ", ");
            System.out.print("Student Weight: " + weightHeight[i][0] + ", ");
            System.out.print("Student Height: " + weightHeight[i][1] + " ");
            System.out.println();
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.print("Please enter values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.print("| " + sum);
            System.out.println();
        }
        System.out.println("----------------------");

        int s = 0;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
            s += sum;
        }
        System.out.print("| " + s);
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double[][] scores = new double[n][5]; // phy, bio, chem | total | avg
        double[] subjectAvg = {0, 0 , 0}; // phy, bio, chem
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " student Physic score: ");
            scores[i][0] = sc.nextDouble();
            System.out.print("Student " + (i + 1) + " student Biology score: ");
            scores[i][1] = sc.nextDouble();
            System.out.print("Student " + (i + 1) + " student Chemistry score: ");
            scores[i][2] = sc.nextDouble();
            scores[i][3] = scores[i][0] +  scores[i][1] + scores[i][2]; // total
            scores[i][4] = (scores[i][0] + scores[i][1] + scores[i][2])/3; // s / c
        }
        System.out.println("Physics, Biology, Chemistry | Total | Average");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": " + scores[i][0] + " " + scores[i][1] + " " + scores[i][2] + " | " + scores[i][3] + " | " +  scores[i][4]);
            subjectAvg[0] += scores[i][0];
            subjectAvg[1] += scores[i][1];
            subjectAvg[2] += scores[i][2];
        }
        subjectAvg[0] /= n;
        subjectAvg[1] /= n;
        subjectAvg[2] /= n;
        System.out.println("\n-----------------------------\n" +
                "Average score for Physics, Biology, and Chemistry\n" +
                subjectAvg[0] + " " + subjectAvg[1] + " " + subjectAvg[2] + "\n" +
                "-----------------------------"
        );
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i+1) + ": ");
            if (scores[i][0] >= subjectAvg[0]) {
                System.out.print("Pass ");
            } else {
                System.out.print("No ");
            }
            if (scores[i][1] >= subjectAvg[1]) {
                System.out.print("Pass ");
            } else {
                System.out.print("No ");
            }
            if (scores[i][2] >= subjectAvg[2]) {
                System.out.print("Pass ");
            } else {
                System.out.print("No ");
            }
            System.out.println();
        }
    }
}
