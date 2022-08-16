package Home_Work_2.loops;

public class Main_1_1_1 {
    public static void main(String[] args) {
        long number; long resultLong=1;
        String result="1";
        String number1;

        if (args.length == 0) {
            System.out.println("Вы не выбрали аргумент для запуска программы");
        }
        boolean cheker =inputCheck(args[0]);

        if (cheker){
            number= Long.parseLong(args[0]);
            System.out.println("Ваш аргумент:"+number);
            for (int i = 2; i<=number;i++){
                number1= Long.toString(i);
                result +="*" +number1;
                resultLong *=i;
            }
            number1= Long.toString(resultLong);
            result +="="+number1;

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
}

