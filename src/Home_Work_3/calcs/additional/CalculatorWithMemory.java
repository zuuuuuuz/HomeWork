package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator I;
    private long countOperation;
    private double result;
    private double memory;

    public CalculatorWithMemory(ICalculator i) {
        I = i;
    }

    public void setMemory() {
        memory = result;
    }

    public double getMemory() {
        double a;
        a = memory;
        memory = 0;
        return a;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double divide(double a, double b) {
        countOperation++;
        return result = I.divide(a, b);

    }

    public double multiple(double a, double b) {
        countOperation++;
        return result = I.multiple(a, b);

    }

    public double plus(double a, double b) {
        countOperation++;
        return result = I.plus(a, b);

    }

    public double minus(double a, double b) {
        countOperation++;
        return result = I.minus(a, b);

    }

    public double pow(double a, int b) {
        countOperation++;
        return result = I.pow(a, b);

    }

    public double module(int a) {
        countOperation++;
        return result = I.module(a);

    }

    public double sqrt(double a) {
        countOperation++;
        return result = I.sqrt(a);

    }

}