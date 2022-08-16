package Home_Work_2;

public class Main_1_2 {
    public static void main(String[] args) {
        long resultLong=1;
        String number1="0";
        String result="";
        if (args.length == 0) {
            System.out.println("Вы не выбрали аргумент для запуска программы");
        }
        boolean cheker =inputCheck(args[0]);

        if (cheker){
            String res = args[0];
            System.out.println("Ваш аргумент: "+res);
            System.out.print("Результат: ");
            for (int i = 0; i<res.length() ;i++){    //i<991
                String z = (String.valueOf(res.charAt(i)));
                long y = Long.parseLong(z);
                if (i==0){
                    System.out.print(y);
                }else result +="*" +y;
                resultLong *=y;
            }
            number1= Long.toString(resultLong);
            result +="="+number1;
            System.out.println(result);
        }if (!cheker){
            try{
                Double.parseDouble(args[0]);
                System.out.println("Введено не целое число\nПроверьте введенный аргумент");
            }catch (Exception e) {
                System.out.println("Введено не число!");
                System.out.println("Некорректный ввод!\nПроверьте введенный аргумент");
            }
        }
    }
    public static boolean inputCheck(String a){
        try {
            long b=Long.parseLong(a);
            return b > 9;
        }catch (Exception e){
            return false;
        }
    }
}
