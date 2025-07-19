package me.utils;

import java.util.Scanner;

public interface Questionnaire {
    default String getName() {
        return "Questionnaire";
    }

    default String getDescription() {
        return "Default Questionnaire";
    }

    void statement(Scanner input);
}
