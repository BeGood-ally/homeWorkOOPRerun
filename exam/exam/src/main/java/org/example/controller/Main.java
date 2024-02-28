package org.example.controller;

import logging.Store;
import services.CalcDivision;
import services.ComplexCalculator;
import services.ComplexNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Введите действительную часть первого числа либо 0,0 для выхода");
            Scanner inpr1 = new Scanner(System.in);
            Double r1 = inpr1.nextDouble();
            if(r1.equals(0.0)){
                break;
            } else {
                System.out.println("Введите мнимую часть первого числа");
                Scanner inpr2 = new Scanner(System.in);
                Double i1 = inpr2.nextDouble();
                System.out.println("Введите действительную часть второго числа");
                Scanner inpr3 = new Scanner(System.in);
                Double r2 = inpr3.nextDouble();
                System.out.println("Введите мнимую часть второго числа");
                Scanner inpr4 = new Scanner(System.in);
                Double i2 = inpr4.nextDouble();
                System.out.println("Выберите действие: 1 - сложение, 2 - умножение, 3 - деление");
                Scanner inpr5 = new Scanner(System.in);
                String act = inpr5.nextLine();

                Comutator first = new Comutator();
                first.start(r1, i1, r2, i2, act);
            }
        }
        Store.view();
    }
}