package Lab;

import me.utils.Lab;
import me.utils.LabManager;
import me.utils.Questionnaire;

import java.util.List;
import java.util.Scanner;

import static java.lang.Double.NaN;

public class Lab03 {

    public static void main(String[] args) {
        new LabManager(new Lab() {
            @Override
            public int getLabNumber() {
                return 3;
            }

            @Override
            public List<Questionnaire> getQuestionnaire() {
                return List.of(q1, q2, q3, q4, q5);
            }
        }).start();
    }

    static Questionnaire q1 = new Questionnaire() {
        @Override
        public void statement(Scanner input) {
            int count = 0;
            while (count < 5) {
                System.out.print((char) ('A' + count));
                count++;
            } // ABCDE
        }
    };

    static Questionnaire q2 = new Questionnaire() {
        @Override
        public void statement(Scanner input) {
            double totalCourseScore = 0;
            double totalCredits = 0;
            boolean active = true;
            while (active) {
                System.out.print("Please enter a grade point (0,1,2,3,4, or 'Z' to stop a program): ");
                String Grade = input.next();
                if (Grade.toUpperCase().charAt(0) == 'Z') {
                    active = false;
                    continue;
                }
                double gradePoint = Double.parseDouble(Grade);
                if (gradePoint > 4) {
                    System.out.println("The grade point cannot be greater than 4");
                    active = false;
                    continue;
                }
                System.out.print("Please enter a subject credit: ");
                double credit = input.nextDouble();
                totalCredits += credit;
                totalCourseScore += gradePoint * credit;
            }
            double gpa = totalCourseScore / totalCredits;
            if (gpa == NaN) {
                gpa = 0;
            }
            System.out.println("The GPA is " + gpa);
        }
    };

    static Questionnaire q3 = new Questionnaire() {
        @Override
        public void statement(Scanner input) {
            System.out.println("Please enter a set of numbers.");
            String[] numbers = input.nextLine().split(" ");
            int sum = 0;
            int i = 0;
            while(i < numbers.length) {
                int number =  Integer.parseInt(numbers[i]);
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number");
                } else {
                    System.out.println(number + " is an odd number");
                }
                sum += number;
                i++;
            }
            System.out.println("The sum is " + sum);
            System.out.println("The average is " + ((double) sum / numbers.length));
        }
    };

    static Questionnaire q4 = new Questionnaire() {
        @Override
        public void statement(Scanner input) {
            System.out.println("Please enter a numbers.");
            int number = input.nextInt();
            System.out.print(number + "! = ");
            int i = number;
            while (i > 0) {
                number *= i;
                i--;
            }
            System.out.print(number);
        }
    };

    static Questionnaire q5 = new Questionnaire() {
        @Override
        public void statement(Scanner input) {
            System.out.print("Please enter an index of Fibonacci number: ");
            int fib = input.nextInt();
            int oldNumber = 0;
            int temp;
            int newNumber = 1;
            System.out.print(oldNumber + ", " + newNumber);
            int i = 0;
            while (i < fib - 2) {
                temp = newNumber;
                newNumber = oldNumber + newNumber;
                System.out.print(", " + newNumber);
                oldNumber = temp;
                i ++;
            }
        }
    };

}
