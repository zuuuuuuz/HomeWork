package Home_Work_1;

import java.util.Scanner;

public class Main4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double number1;
        Double number2;

        while (true) {
            try {
                System.out.println("Введите 2 числа");
                number1 = Double.parseDouble(console.nextLine());
                number2 = Double.parseDouble(console.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Некорректный ввод, попробуй еще раз:");
            }
        }
        if (number1%number2==0) {
            System.out.println("число "+number1+" делится на "+number2);
        }else System.out.println("число "+number1+ " не делится на "+number2+ "\nостаток: "+number1%number2);
    }
}
