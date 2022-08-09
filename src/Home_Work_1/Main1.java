package Home_Work_1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number1 = 0;   //переменные для ввода 2 чисел
        long number2 = 0;

        while (true) {                                 /*проверка на корректность ввода, если будет введена буква или
                                                                  символ, цикл попросит еще раз ввести значение*/
            try {
                System.out.println("Введи 2 целых числа:");
                number1 = Long.parseLong(console.nextLine()); //в переменную записывается введенное число 150 (1001_0110)
                number2 = Long.parseLong(console.nextLine()); //в переменную записывается введенное число 201 (1100_1001)
                break;
            }catch (Exception e){
                System.out.println("Некорректный ввод, попробуй еще раз:");
            }
        }
        int binaryOrDecimal;   //переменная для выбора системы счисления
        System.out.println("В какой системе счисления вывести результат, двоичной или десятичной? (2/10)");

        while (true) {       /*проверка на корректность ввода, если будет введена буква,
                              символ или любое другое значение кроме 2 или 10 цикл попросит еще раз ввести значение*/
            try {
                binaryOrDecimal = Integer.parseInt(console.nextLine());//в переменную записывается введенное число (2 или 10)
                if (binaryOrDecimal != 2 && binaryOrDecimal != 10) {
                    throw new RuntimeException();
                }
                break;
                } catch (Exception e){
                    System.out.println("Выбери 2 или 10\nПопробуй еще раз:");
                }
            }

        switch (binaryOrDecimal) {
                case 2:     //если значение переменной binaryOrDecimal = 2, выводит результат в двоичной сс
                    System.out.println("побитовый и\n" + Long.toBinaryString(number1 & number2));
                    // побитовый И для чисел 150 и 201 = 128
                    System.out.println("побитовое или\n" + Long.toBinaryString(number1 | number2));
                    // побитовый И для чисел 150 или 201 = 223
                break;
                case 10:     //если значение переменной binaryOrDecimal = 2, выводит результат в десятичной сс
                    System.out.println("побитовый и\n" + (number1 & number2));
                    /* побитовый И для чисел 150 и 201
                         1001_0110 & 1100_1001 = 1000_0000   */
                    System.out.println("побитовое или\n" + (number1 | number2));
                     /* побитовый ИЛИ для чисел 150 и 201
                         1001_0110 & 1100_1001 = 1101_1111   */
                    break;
                default:
                    System.out.println("проверьте корректность выбора системы счисления");
            }
        }
    }
 /*c числом 42.5 нельзя произвести побитовую операцию, т.к. побитовые операции применимы к целочисленным значениям.
        Таким образом к числу 42.5 побитовые операции не применимы.    */