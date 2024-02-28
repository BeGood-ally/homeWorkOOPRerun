package org.example.controller;

import logging.LogCalc;
import logging.Store;
import services.ComplexCalculator;
import services.ComplexNumber;

public class Comutator {
    Double r1;
    Double i1;
    Double r2;
    Double i2;
    String operation;

    public Comutator(Double r1, Double i1, Double r2, Double i2, String operation) {
        this.r1 = r1;
        this.i1 = i1;
        this.r2 = r2;
        this.i2 = i2;
        this.operation = operation;
    }

    public Comutator() {
    }

    public void start(Double r1, Double i1, Double r2, Double i2, String operation){
        ComplexNumber num1 = new ComplexNumber(r1, i1);
        ComplexNumber num2 = new ComplexNumber(r2, i2);
        ComplexCalculator calc = new ComplexCalculator(num1, num2);
        ComplexNumber num3 = calc.actionClasses(num1, num2, operation);
        num3.viewComplexNumber();
        LogCalc Lc = new LogCalc();
        Store.saving(Lc.viewAction(num1, num2, num3, operation));
    }
}
