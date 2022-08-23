package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator {
    private static ICalculator I;
    private static double memory;

    public static ICalculator getCalculator() {
        return I;
    }

    public ICalculator getCalculater(){
        return I;
    }
    public CalculatorWithMemoryDecorator(ICalculator I) {
        this.I = I;
    }


    public double divide(double a, double b) {
        return memory=I.divide(a, b);
    }


    public double multiple(double a, double b) {
        return memory= I.multiple(a, b);    }


    public double minus(double a, double b) {
        return memory= I.minus(a, b);
    }


    public double plus(double a, double b) {
        return memory= I.plus(a, b);
    }


    public double pow(double a, int b) {
        return memory= I.pow(a, b);
    }


    public double module(double a) {
        return memory= I.module(a);
    }

    public double sqrt(double a) {
        return memory=I.sqrt(a);
    }

    public static double getMemory() {
        double a;
        a = memory;
        memory = 0;
        return a;
    }
}

