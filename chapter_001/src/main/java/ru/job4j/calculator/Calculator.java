package ru.job4j.calculator;

/**
 *Class Calculator решение задачи части 001 урок 3.1.
 *@author DKupriyanyuk
 *@version $ld$
 *@since 28.02.2018
 */

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    
    public void subtract(double first, double second) {
        this.result = first - second;
    }
	
    public void multiple(double first, double second) {
        this.result = first * second;
    }
	
    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }
}