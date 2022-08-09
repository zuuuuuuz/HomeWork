package Home_Work_1;

import java.util.Scanner;

public class Main4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double number1;  //переменные для 2 чисел
        Double number2;

        while (true) {  /*проверка на корректность ввода, если будет введена буква или символ
                                               цикл попросит еще раз ввести значение*/
            try {
                System.out.println("Введите 2 числа");
                number1 = Double.parseDouble(console.nextLine());
                number2 = Double.parseDouble(console.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Некорректный ввод, попробуй еще раз:");
            }
        }
        if (number1%number2==0) {           //если есть остаток = число не делится
            System.out.println("число "+number1+" делится на "+number2);
        }else System.out.println("число "+number1+ " не делится на "+number2+ "\nостаток: "+number1%number2);
    }
}
