package Home_Work_2.loops;

public class Main_1_1_2 {
    public static void main(String[] args) {
        long number; long resultLong=1;
        String result="1";
        String number1,number2;

        if (args.length == 0) {
            System.out.println("Вы не выбрали аргумент для запуска программы");
        }
        boolean cheker =inputCheck(args[0]);

        if (cheker){
            number= Long.parseLong(args[0]);
            System.out.println("Ваш аргумент:"+number);
            resultLong=rekursiv(number);

            if (resultLong == 0) {
                System.out.println("Вы выбрали слишком большое число");
            }else {
                for (int i = 2; i<=number;i++){
                    number1= Long.toString(i);
                    result +="*" +number1;
                    resultLong *=i;
                }
            }
            number2= Long.toString(resultLong);
            result +="="+number2;


            System.out.println("Результат: "+result);
        }else System.out.println("Некорректный ввод!\nПроверьте введенный аргумент");
    }
    /**
     * Метод inputCheck проверяет вводимые данные
     * @param a Строка
     * @return true - проверку прошло; false -  проверку не прошло.
     */
    public static boolean inputCheck(String a){
        try {
            long b=Long.parseLong(a);
            return b >= 0 && b <= 20;//чтобы не было переполнения
        }catch (Exception e){
            return false;
        }
    }
    /**
     * Метод rekursiv считает методом рекурсии
     * @param r  Число для которого нужно посчитать
     * @return Возвращает результат == в случае переполнения.
     */
    public static long rekursiv(long r) {
        if (r <= 1) {
            return 1;
        } else {
            if (r > 12) {
                return 0;
            } else {
                return r * rekursiv(r - 1);
            }
        }
    }
}

