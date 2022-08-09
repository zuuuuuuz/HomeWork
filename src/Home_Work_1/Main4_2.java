package Home_Work_1;

import java.util.Scanner;

public class Main4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double numberOne;
        double numberTwo;
        double numberThree;

        while (true) {
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

            boolean sredneeNumber1 = (numberOne < numberTwo && numberOne > numberThree) || (numberOne > numberTwo && numberOne < numberThree);
            boolean sredneeNumber2 = (numberTwo < numberOne && numberTwo > numberThree) || (numberTwo > numberOne && numberTwo < numberThree);

            if (sredneeNumber1) {
                System.out.println("число "+ numberOne+ " является средним");
            }else if (sredneeNumber2) {
                     System.out.println("число "+numberTwo+" является средним");
            }else System.out.printf("число " +numberThree+ "является средним");
        }else System.out.println("Вы ввели одинаковые значения");

    }
}
