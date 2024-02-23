package service;

import org.example.model.Teacher;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacher implements ServiceTeacher{

    List<Teacher>listTeacher = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(listTeacher.size() + 1);
        listTeacher.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return listTeacher;
    }
}
