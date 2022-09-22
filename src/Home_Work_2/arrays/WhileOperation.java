package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation{
    public static void main(String[] args){
        WhileOperation array = new WhileOperation();
        int[] arr = arrayFromConsole();
        array.arraysElements(arr);
        array.everySecondElement(arr);
        array.arrayReversive(arr);
    }

    @Override
    public String arraysElements(int[] arr) {
        //перебор массива через цикл while
        //System.out.println("Перебор массива через цикл while:");
        String str="Перебор массива через цикл while: ";

        for (int i = 0; i < arr.length; i++) {
            str +=" " + arr[i];
        }
        return  str;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
        //Каждый второй элемент массива через цикл while
        //System.out.println("Каждый второй элемент массива через цикл while:");
        int[] str=new int[0];
        int i = 1;
        int j = 0;
        while (i < arr.length) {
            str = Arrays.copyOf(str, str.length + 1);
            str[j] = arr[i];
            i+=2;
            j++;
        }
        return str;
    }

    @Override
    public int[] arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл while
       // System.out.println("все элементы массива в обратном порядке через цикл while:");
        int[] str = new int[arr.length];
        int i = arr.length - 1;
        int j = 0;
        while (i >= 0) {
            str[j] = arr[i];
            i--;
            j++;
        }
        return str;
    }
}