package org.example;

public class Treadmill extends ObstacleCourse{
    public Treadmill(String name, int Length, int Height) {
        super(name, Length, Height);
        this.Length = Length;
        this.Height = Height;
        Competitors.addObstacle(this);
    }
}
