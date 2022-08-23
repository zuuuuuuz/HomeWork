package Home_Work_3.calcs.api;

public interface ICalculator {
    double divide (double a, double b);
    double multiple (double a, double b);
    double minus (double a, double b);
    double plus (double a, double b);
    double pow (double a, int b);
    double module (double a);
    double sqrt (double a);
    long getCountOperation();
}
