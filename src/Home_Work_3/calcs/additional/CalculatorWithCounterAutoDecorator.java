package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private static ICalculator I;
    private static long countOperation;

    public static ICalculator getCalculator() {
        return I;
    }
    public CalculatorWithCounterAutoDecorator(ICalculator I) {
        this.I = I;
    }
    public long getCountOperation() {
        return countOperation;
    }

    @Override
    public double divide(double a, double b) {
        countOperation++;
        return I.divide(a, b);
    }

    @Override
    public double multiple(double a, double b) {
        countOperation++;
        return I.multiple(a, b);    }

    @Override
    public double minus(double a, double b) {
        countOperation++;
        return I.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        countOperation++;
        return I.plus(a, b);
    }

    @Override
    public double pow(double a, int b) {
        countOperation++;
        return I.pow(a, b);
    }

    @Override
    public double module(double a) {
        countOperation++;
        return I.module(a);
    }

    @Override
    public double sqrt(double a) {
        countOperation++;
        return I.sqrt(a);
    }



}
