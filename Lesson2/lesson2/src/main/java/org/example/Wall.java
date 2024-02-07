package org.example;

public class Wall extends ObstacleCourse {

    public Wall(String name, int Length, int Height) {
        super(name, Length, Height);
        this.Length = Length;
        this.Height = Height;
        Competitors.addObstacle(this);
    }
}
