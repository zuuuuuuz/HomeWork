package Home_Work_2.loops;

public class Main_1_1_2_ {
    public static void main(String[] args) {
        byte number = Byte.parseByte(args[0]);
        long fact = factorial2(number);
        System.out.println(format(number, fact));

    }

    public static long factorial(byte number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= 1;
        }
        return fact;
    }
    public static String format(int number,long result){
        String str = " ";
        for (int i=1;i<=number;i++){
            str+=i;
            if(i!=number){
                str +=" * ";
            }
        }
        str+=" = "+result;
        return str;
    }

    public static long factorial2(byte number) {
        if (number == 1) {
            return 1;
        }
        return number *factorial2((byte)(number-1)) ;
    }
}
