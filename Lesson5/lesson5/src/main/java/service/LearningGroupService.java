package service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LearningGroupService {
    Teacher teacherKey;
    List<Student> studentValue;
    HashMap<Teacher, List<Student>> createdGroup = new HashMap<>();

    public LearningGroupService(Teacher teacherKey, List<Student> studentValue) {
        this.teacherKey = teacherKey;
        this.studentValue = studentValue;
    }

    public HashMap <Teacher, List<Student>> createGroup(){
        createdGroup.put(teacherKey, studentValue);
        return createdGroup;
    }
}
