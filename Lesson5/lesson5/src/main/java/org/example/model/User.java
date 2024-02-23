package org.example.model;

public abstract class User {
    protected String name;
    protected Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
