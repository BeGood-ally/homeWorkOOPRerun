package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 34, 4, 81));
        List<Integer> array2 = new ArrayList<>(Arrays.asList(2, 34, 3));
        List<Integer> array3 = new ArrayList<>(Arrays.asList(120, 4, 5));
        Calculator calculator = new Calculator();
        System.out.println("Сумма равна: " + calculator.sum(array1));
        System.out.println("Произведение равно: " + calculator.mult(array2));
        System.out.println("Результат деления равен: " + calculator.div(array3));
        calculator.dec_to_bin(10);
        calculator.dec_to_bin(65.34);
        calculator.dec_to_bin("54");
        calculator.bin_to_dec("00001010");
    }
}