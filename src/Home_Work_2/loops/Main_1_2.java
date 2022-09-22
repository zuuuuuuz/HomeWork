package Home_Work_2.loops;

import javax.management.StringValueExp;

public class Main_1_2 {
    public String fibonachi(int a){
        long resultLong=1;
        String number1;
        String result="1";
        boolean cheker =inputCheck(Integer.toString(a));
        if (cheker){
            String res = Integer.toString(a);
            for (int i = 0; i<res.length() ;i++){
                String z = (String.valueOf(res.charAt(i)));
                long y = Long.parseLong(z);
                if (i==0){
                    System.out.print(y);
                }else result +="*" +y;
                resultLong *=y;
            }
            number1= Long.toString(resultLong);
            result +="="+number1;
            return result;
        }else return null;

    }

    /**
     * Метод inputCheck проверяет вводимые данные
     * @param a Строка
     * @return true - проверку прошло; false -  проверку не прошло.
     */
    public static boolean inputCheck(String a){
        try {
            int b=Integer.parseInt(a);
            return b > 9;
        }catch (Exception e){
            return false;
        }
    }
}
