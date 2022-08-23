package Home_Work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithCounterAutoSuper calculator;
    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calc){
        calculator=calc;
    }
    public long getCounter(){
        return getCounter();
    }

    public double pow(double a,int b){
        return pow(a, b);
    }

    public double module(double a) {
        return module(a);
    }

    public double sqrt(double a) {
        return sqrt(a);
    }

    public double divide(double a,double b){
        return divide(a, b);
    }

    public double multiple(double a,double b){
        return  multiple(a,b);
    }

    public double minus(double a,double b){
        return minus(a, b);
    }

    public double plus(double a, double b){
        return plus(a, b);
    }
}
