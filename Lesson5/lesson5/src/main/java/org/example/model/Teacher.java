package org.example.model;

public class Teacher extends User{
    Integer TeacherId;
    String subject;

    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void setTeacherId(Integer teacherId) {
        TeacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + TeacherId +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
