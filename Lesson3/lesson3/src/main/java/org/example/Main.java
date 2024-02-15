package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame ag = new GameNumber();
        Scanner word_size = new Scanner(System.in);
        System.out.println("Введите размер слова");
        int ws = word_size.nextInt();
        Scanner try_count = new Scanner(System.in);
        System.out.println("Введите количество попыток");
        int tc = try_count.nextInt();
        Scanner word_type = new Scanner(System.in);
        System.out.println("Введите тип символа слова:\n1-цифра\n2-латинская буква\n3-буква киррилицы");
        int wt = word_type.nextInt();
        ag.start(ws,tc,wt);
        System.out.println("Введи значение ");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили");
        } else if (ag.getGameStatus().equals(GameStatus.LOOSE)){
            System.out.println("Вы проиграли");
            System.out.println("Загаданным словом было: " + ag.getGenerateWord());
        }
        else {
            System.out.println("Неопознанный статус");
        }
    }
}