package view;

import org.example.model.Student;
import org.example.model.Teacher;

import java.util.HashMap;
import java.util.List;

public class GroupView {
    Teacher groupLeader;
    public void printGroup(Teacher gL, HashMap<Teacher, List<Student>> gr){
        System.out.println("Под руководством педагога:\n" + gL + "\nучится группа:\n" + gr.get(gL));
    }
}
