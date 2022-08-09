package Home_Work_1;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 10 цифр номера телефона:");

        while (!console.hasNextInt()) {/*проверка на корректность ввода, если будет введена буква,
                                                         символ цикл попросит еще раз ввести значение*/
            System.out.println("Некорректный ввод, попробуй еще раз:");
            console.next();
        }
        String allNumbers= console.nextLine();

        while(allNumbers.length() !=10){
            System.out.println("Неверное кол-во цифр, проверьте ввод");
            allNumbers=console.nextLine();
        }
        int arr[] = new int[10];
        for (int i=0; i<10; i++){
            if (Character.isDigit(allNumbers.charAt(i))){
                arr[i]= Character.getNumericValue(allNumbers.charAt(i));
            }
        }
        System.out.println("Номер телефона: "+ createPhoneNumber(arr));
    }
    public static String createPhoneNumber(int[] arr) {
        //String phoneNumber = Arrays.toString(arr);
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9]);
        //делаем соответсвующий заданию вид номера телефона
    }
}
