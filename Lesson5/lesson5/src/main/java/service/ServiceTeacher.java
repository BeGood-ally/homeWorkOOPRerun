package service;

import org.example.model.Teacher;
import org.example.model.User;

import java.util.List;

public interface ServiceTeacher {
    Teacher create(User iser);
    List<Teacher> read();
}
