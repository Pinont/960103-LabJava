package Lab;

public class GroupWork {
    public static void main(String[] args) {
        int [][] groupTable = new int [2][3];
        groupTable[1][1] = 2;
        groupTable[1][2] = 3;
        groupTable[0][1] = 7;
        groupTable[0][2] = 10;
        groupTable[1][1] = 9;
        groupTable[1][1] = groupTable[1][1]*2;
        groupTable[0][0] = groupTable[0][0] * groupTable[1][2];

        int[][] tableA;
        int[][] tableB = new int[4][4];

        tableA = groupTable;
        tableB[0][0] = 100;
        tableB[0][1] = 50;
        tableA[0][0] = 100;
        groupTable[0][1] = 50;
        tableB[1][0] = 30;
        System.out.println("G Table[0][0] =" + groupTable[0][0]);
        System.out.println("A Table[0][0] =" + tableA[0][0]);
        System.out.println("B Table[0][0] =" + tableB[0][0]);
        System.out.println("G Table[0][1] =" + groupTable[0][1]);
        System.out.println("A Table[0][1] =" + tableA[0][1]);
        System.out.println("B Table[0][1] =" + tableB[0][1]);
        System.out.println("G Table[1][0] =" + groupTable[1][0]);
        System.out.println("A Table[1][0] =" + tableA[1][0]);
        System.out.println("B Table[1][0] =" + tableB[1][0]);

        System.out.println(groupTable);
        System.out.println(groupTable[0]);
        System.out.println(groupTable[0][0]);
        System.out.println(groupTable[1]);
        System.out.println(groupTable[1][1]);
    }
}
