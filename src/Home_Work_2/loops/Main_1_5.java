package Home_Work_2;

import java.util.Random;
import java.util.Scanner;

public class Main_1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        while (!console.hasNextLong()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        long a = console.nextLong();

        long m = 0;//max number
        System.out.println("Введенный аргумент: " + a);
        long maximal = maxNumber(a);
        System.out.println("Максимальная цифра: " + maximal);

        String str=summatorOfEvenAndOdd(a);
        System.out.println("\n"+str+"\n");

        System.out.println("Введите колличество генерируемых чисел)");
        System.out.println("(при большей выборке - более точные данные, лучше выбрать не менее 1000)");
        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        int n = console.nextInt();
        double chance = veroyatnosti(n);
        System.out.println("Вероятность генерации четного числа: "+chance+"%");

        System.out.println("\nВведите число для ряда Фибоначчи");
        while (!console.hasNextLong()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        long q = console.nextLong();
        String fibonacci=fibonachi(q);
        System.out.println(fibonacci);

        float minimal;
        float maximall;
        float step;
        System.out.println("\nТребуется минимальное значение, максимальное и шаг");
        while (1==1) {  /*проверка на корректность ввода, если будет введена буква или символ
                                                         цикл попросит еще раз ввести значение*/
            try {
                minimal =Float.parseFloat(console.nextLine());
                maximall = Float.parseFloat(console.nextLine());
                step = Float.parseFloat(console.nextLine());
                break;
            } catch (Exception ne){
                System.out.println("Введите значения:");
            }
        }
        String str2=stepByStep(minimal,maximall,step);
        System.out.println(str2);

        System.out.println("Введите число для переворота");
        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        int number1 = console.nextInt();
        String str4=perevorot(number1);
        System.out.println(str4);


    }
    public static long maxNumber(long c) {
        long max = 0;//max number
        while (c > 0) {
            if (c % 10 > max) {
                max = c % 10;
            }
            c = c / 10;
        } return max;
    }
    public static double veroyatnosti(int y){
        int array[]= new int[y];
        double schetchik=0;
        double veroyatnost;
        Random rand = new Random();
        for (int i = 0;i<array.length;i++){
            array[i]= rand.nextInt(100);
        }

        for (int i = 0;i<array.length;i++){
            int element = array[i];
            if (element%2==0){
                ++schetchik;
            }
        }veroyatnost=(schetchik/y)*100;
        return veroyatnost;
    }
    public static String summatorOfEvenAndOdd(long a){
        String result;
        long number=a;
        int even=0;
        int odd=0;
        while (a>0){
            if (a%2==0){
                even=++even;
            }else odd=++odd;
            a=a/10;
        }
        return result="В числе "+number+" находится "+even+" четных цифр и "+odd+" нечетных";
    }
    public static String fibonachi(long q){
        long q1=1;
        long q2=2;
        long b=0;
        String str="";
        for (int i=1;i<q;i++){
            //long v=(q1+q2);
            if (i==1){
                System.out.print("Последовательность Фибоначчи: "+q1+"  ");
            }else if(i==2){
                System.out.print(q2+" ");
            }else if(i!=1||i!=2) {
                System.out.printf(" %d ", q1 + q2);
                b = q1;
                q1 = q2;
                q2 = q1 + b;
            }

        }return str="";
    }
    public static String stepByStep(float min, float max, float step){
        System.out.print("От числа "+min+" до числа "+max+" с шагом в "+step+" =");
        String str2;
        for (int i=0;min<max;i++){
            System.out.print(" "+min);
            min= min+step;
        }
        System.out.print(" "+max);
        return str2="";
    }
    public static String perevorot(int number){
        int m=0;
        String str4;
        while (number>0){
            m=m*10+number%10;
            number=number/10;
        }
        System.out.println(m);
        return str4="";
    }
}
