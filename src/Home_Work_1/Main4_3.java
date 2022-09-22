package Home_Work_1;

import java.util.Scanner;

public class Main4_3 {
    public String divideOrNot(double number1,double number2 ) {
        Scanner console = new Scanner(System.in);
        String str="";

        if (number1%number2==0) {           //если есть остаток = число не делится
            str="число "+number1+" делится на "+number2;
        }else str="число "+number1+ " не делится на "+number2+ "\nостаток: "+number1%number2;
        return str;
    }
}
