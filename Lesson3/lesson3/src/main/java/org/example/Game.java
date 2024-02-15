package org.example;

public interface Game {
    void start(Integer wordSize, Integer tryCount, Integer wordType);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
