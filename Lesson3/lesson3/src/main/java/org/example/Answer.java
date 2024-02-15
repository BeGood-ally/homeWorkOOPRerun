package org.example;

public class Answer {
    private int cowCounter;
    private int bullCounter;
    private Integer tryCount;

    @Override
    public String toString() {
        return cowCounter + " коровы " + bullCounter + " быков, осталось попыток : " + tryCount;
    }

    public Answer(int cowCounter, int bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }
}
