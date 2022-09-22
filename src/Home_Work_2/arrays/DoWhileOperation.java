package Home_Work_2.arrays;
import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation {


    @Override
    public String arraysElements(int[] arr) {
        //Перебор массива через цикл do...while
        //int[] str=new int[arr.length];
        int i = 0;
        String str = "";
        //System.out.println("Перебор массива через цикл do...while: ");
        for (int element : arr) {
            str = str + " " + element;
        }
        return str;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
        int [] str = new int[0];
        int x = 0;
        int z = 0;
        for (int element : arr) {

            x++;

            if(x % 2 == 0){

                str = Arrays.copyOf(str, str.length + 1);

                str[z] = arr[x - 1];
                z++;
            }
            if(x == arr.length){
                break;
            }
        }
        return str;
    }


    @Override
    public int[] arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл do...while
        int i = arr.length-1;
        int[] str=new int[arr.length];
        //System.out.println("все элементы массива в обратном порядке через цикл do...while: ");
        for (int element : arr) {
            str[i] = element;
            i--;
        }
        return str;
    }
}
