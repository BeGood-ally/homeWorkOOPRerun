package controller;

import org.example.model.LearningGroup;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import service.DataStudent;
import service.DataTeacher;


import service.LearningGroupService;
import view.GroupView;
import view.StudentView;
import java.util.List;

public class Controller {

    private DataStudent dataStudentService;
    private DataTeacher dataTeacherService;
    private StudentView view;
    private GroupView viewGrp;
    public void start() {
        User user1 = new Student("Vasya", 21, 4.1);
        User user3 = new Student("Sergey", 22, 4.0);
        User user2 = new Teacher("Yuriy", 40, "math");
        createStudent(user1);
        createStudent(user3);
        createTeacher(user2);
        List<Student> studentList = dataStudentService.read();
        LearningGroup group1 = new LearningGroup((Teacher) user2, studentList);
        LearningGroupService fgroup1 = new LearningGroupService((Teacher) user2, studentList);
        viewGrp.printGroup((Teacher) user2, fgroup1.createGroup());
    }

    public Student createStudent(User user){
        return dataStudentService.create(user);
    }

    public Teacher createTeacher(User user){
        return dataTeacherService.create(user);
    }

    public Controller(){
        dataStudentService = new DataStudent();
        dataTeacherService = new DataTeacher();
        view = new StudentView();
        viewGrp = new GroupView();
    }
}
