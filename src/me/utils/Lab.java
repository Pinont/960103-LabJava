package me.utils;

import java.util.List;

public interface Lab {
    default String getName() {
        return "Lab" + getLabNumber() ;
    }

    int getLabNumber();

    List<Questionnaire> getQuestionnaire();
}
