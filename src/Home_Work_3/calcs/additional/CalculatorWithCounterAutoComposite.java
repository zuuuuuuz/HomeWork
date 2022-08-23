package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoComposite {
   private CalculatorWithCounterAutoSuper calc=new CalculatorWithCounterAutoSuper();
   public long getCounter(){
       return calc.getCountOperation();
   }

   public double pow(double a,int b){
       return calc.pow(a, b);
   }

    public double module(double a) {
        return calc.module(a);
    }

    public double sqrt(double a) {
        return calc.sqrt(a);
    }

    public double divide(double a,double b){
        return calc.divide(a, b);
    }

    public double multiple(double a, double b){
        return calc.multiple(a, b);
    }

    public double minus(double a,double b){
        return calc.minus(a, b);
    }

    public double plus(double a, double b){
        return calc.plus(a, b);
    }
}
