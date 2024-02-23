package org.example.model;

public class Student extends User{
    Integer StudentId;
    Double average;

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Student(String name, Integer age, Double average) {
        super(name, age);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
