package Home_Work_1;

import java.util.Scanner;

public class Main4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double numberOne;    //переменные для 3 чисел
        double numberTwo;
        double numberThree;

        while (true) {  /*проверка на корректность ввода, если будет введена буква или символ
                                                         цикл попросит еще раз ввести значение*/
            try {
                System.out.println("Введите три числа");
                numberOne = Double.parseDouble(console.nextLine());
                numberTwo = Double.parseDouble(console.nextLine());
                numberThree = Double.parseDouble(console.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Некорректный ввод, попробуй еще раз:");
            }
        }

        if (numberOne != numberTwo && numberTwo != numberThree && numberOne!=numberThree) {
            //если третье< первое <второго или третье> первое >второго=>первое число среднее
            boolean sredneeNumber1 = (numberOne < numberTwo && numberOne > numberThree) || (numberOne > numberTwo && numberOne < numberThree);
            //если третье< второе <первое или третье> второе >первое=>второе число среднее
            boolean sredneeNumber2 = (numberTwo < numberOne && numberTwo > numberThree) || (numberTwo > numberOne && numberTwo < numberThree);
            //если 1 число не среднее и 2 не среднее => 3 число среднее
            if (sredneeNumber1) {
                System.out.println("число "+ numberOne+ " является средним");
            }else if (sredneeNumber2) {
                     System.out.println("число "+numberTwo+" является средним");
            }else System.out.printf("число " +numberThree+ "является средним");
        }else System.out.println("Вы ввели одинаковые значения");

    }
}
