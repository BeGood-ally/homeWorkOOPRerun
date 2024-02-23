package service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.List;

public interface ServiceStudent {
    Student create(User iser);
    List<Student> read();
}
