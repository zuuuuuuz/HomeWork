package Home_Work_2.loops;

public class Main_1_3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Вы не выбрали аргумент для запуска программы");
        }

        boolean cheker =inputCheck(args[0],args[1]);

        if (cheker){
            String res = args[0]+" и "+args[1];
            double numberOne = Double.parseDouble(args[0]);
            long powNumber = Long.parseLong(args[1]);
            double result  = pow1(numberOne,powNumber);
            System.out.println("Ваш аргумент: "+res);
            System.out.print("Результат: ");
            System.out.println(numberOne+"^"+powNumber+" = "+result);
        }else System.out.println("Некорректный ввод!\nПроверьте введенный аргумент");
    }
    /**
     * Метод pow1 возводит число в степень.
     * @param a число
     * @param b степень
     * @return результат возведения
     */
    public static double pow1(double a, long b){
        double resultat=1;
        for (int i = 1; i<=b ;i++){
             resultat *=a;
        }
        return resultat;
    }
    /**
     * Метод inputCheck проверяет вводимые данные
     * @param a Строка
     * @return true - проверку прошло; false -  проверку не прошло.
     */
    public static boolean inputCheck(String a,String b){
        try {
            Double d = Double.parseDouble(a);
            Long l = Long.parseLong(b);
            if (l<0){
                throw new RuntimeException();
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
