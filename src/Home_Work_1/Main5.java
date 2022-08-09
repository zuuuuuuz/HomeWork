package Home_Work_1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        boolean weekday=false;
        boolean vacation=false;
        String str1 = "true";
        String str2 = "false";
        Scanner console = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?(true/false)");
        while (!console.hasNextBoolean()) {
            if(!console.hasNext(str1) || !console.hasNext(str2)){
                System.out.println("Некорректный ввод, попробуй еще раз: true/false ?");
            }
            console.next();
        }
        weekday = console.nextBoolean();
        if(weekday){
            vacation =false;
            System.out.println("кажется у вас и правда рабочая неделя");
        } else {
            System.out.println("О, так у вас отпуск! Прекрасно!");
        }

        if (sleepIn(weekday, vacation)){
            System.out.println("Можно спокойно выспаться!!!");
        } else{
            System.out.println("Это грустно, но придется вставать на работу :(");
        }
    }
    public static boolean sleepIn (boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        }else {
            return true;
        }
    }
}
