package Home_Work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing2_4 {
    @Test
    public void sumOfEvenElements(){
        Main_2_4 smth = new Main_2_4();
        Assertions.assertEquals(30,smth.Main_2_4_1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    @Test
    public void maximumOfEvenIndexed(){
        Main_2_4 smth = new Main_2_4();
        Assertions.assertEquals(8888,smth.Main_2_4_2(new int[]{1, 2, 3, 4, 5, 6, 7, 8888 ,9, 10}));
    }
    @Test
    public void elementsLessThanArithmeticMean(){
        Main_2_4 smth = new Main_2_4();
        Assertions.assertArrayEquals(new int[]{1, 2},smth.Main_2_4_3(new int[]{1, 2, 3, 4, 5, 6}));
    }
    @Test
    public void twoSmallestArrayElements(){
        Main_2_4 smth = new Main_2_4();
        Assertions.assertArrayEquals(new int[]{0, 1},smth.Main_2_4_4(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,0}));
    }
    @Test
    public void sumOfArrayDigits(){
        Main_2_4 smth = new Main_2_4();
        Assertions.assertEquals(46,smth.Main_2_4_6(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 , 10}));
    }
}
