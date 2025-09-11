package Lab;

public class MockExam {
    public static void main(String[] args) {
        int x = 10;
        switch(x) {
            case 10:
                x++;
                System.out.print("a");
            case 11:
                System.out.print("b");
                default:
                    System.out.print("c");
        }
    }
}
