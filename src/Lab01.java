import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        q2_1();
    }

    private static void q1() { // Area, Circumference
        System.out.print("Enter the radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.1416 *radius * radius;
        double circumference = 2*3.1416 * radius;
        System.out.println("The area of this circle is " + area);
        System.out.println("The circumference is " + circumference);
        /*
            5.0 78.54 31.416
            12 452.3904 75.3984
            255456 2.0501380374773758E11 1605081.1391999999
        */
    }

    private static void q2() { // Celsius to Fahrenheit
        System.out.print("Enter the temperature in Celsius : ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("The temperature in Fahrenheit for Celsius value " + celsius + " is " + fahrenheit);
    }

    private static void q2_1() {
        System.out.print("Enter the temperature in Fahrenheit : ");
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double F2celcius = (fahrenheit - 32.0) / (9.0/5.0);
        System.out.println("Celcius is " + F2celcius);
    }

    private static void q3() { // Currency Conversion
        final double usd = 32.52;
        System.out.print("Enter thb: ");
        Scanner scanner = new Scanner(System.in);
        double thb = scanner.nextDouble();
        double conversion = thb/usd;
        System.out.println("The conversation number is " + conversion + "$");
    }

    private static void q4() { // Time travel
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance (m) : ");
        double distance = scanner.nextDouble();
        System.out.print("\nEnter the speed (m/s) : ");

        double speed = scanner.nextDouble();
        double calTime = ( (distance / speed) ) / 60;

//        System.out.print("\nEnter the Resting Time (min) Route1 : ");
//        int route1 = scanner.nextInt();
//
//        System.out.print("\nEnter the Resting Time (min) Route2 : ");
//        int route2 = scanner.nextInt();

//        double time = calTime + route1 + route2;

        System.out.println("The time is " + calTime + "min");
    }
}