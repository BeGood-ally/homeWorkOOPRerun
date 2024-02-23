package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class LearningGroup {
    Teacher master;
    List<Student>pupils = new ArrayList<>();

    public LearningGroup(Teacher master, List<Student> pupils) {
        this.master = master;
        this.pupils = pupils;
    }
}
