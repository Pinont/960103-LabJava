package me.utils;

import java.util.Scanner;

public class LabManager {

    private final Lab lab;

    private int startAt = 1;

    public LabManager setQuizStartAt(int number) {
        this.startAt = number;
        return this;
    }

    public LabManager(Lab lab) {
        this.lab = lab;
    }

    public void start() {
        System.out.print("Please enter question number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            lab.getQuestionnaire().get(Math.abs(startAt - i)).statement(sc);
        }
    }

}
