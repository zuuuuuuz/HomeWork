package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation{
    public static void main(String[] args){
        ForOperation array = new ForOperation();
        int[] arr = arrayFromConsole();
        array.arraysElements(arr);
        array.everySecondElement(arr);
        array.arrayReversive(arr);
    }

    @Override
    public String arraysElements(int[] arr) {
        //Перебор массива через цикл for
        //System.out.print("Перебор массива через цикл for имеет вид: ");
        String str="";
        for (int i = 0; i < arr.length; i++) {
            str+=(arr[i] + " ");
        }
        return str;
    }
    @Override
    public int[] everySecondElement(int[] arr) {
        //Каждый второй элемент массива через цикл for
        //System.out.print("Каждый второй элемент массива через цикл for имеет вид: ");
        int[] str = new int[0];
        int j = 0;
        for (int i = 1; i < arr.length; i+=2) {
            str = Arrays.copyOf(str, str.length + 1);
            str[j] = arr[i];
            j++;
        }
        return str;
    }
    @Override
    public int[] arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл for
        int[] str=new int[arr.length];
        //System.out.print("Массив в обратном порядке через цикл for имеет вид: ");
        int x=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            str[x]+=arr[i];
            x++;
        }
        return  str;
    }
}
