package Home_Work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingForOper {
    @Test
    public void elementsArray(){
        ForOperation smth = new ForOperation();
        Assertions.assertEquals("1 2 3 4 5 6 7 8 9 ",smth.arraysElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void everySecondElement(){
        ForOperation smth = new ForOperation();
        Assertions.assertArrayEquals( new int[]{2, 4, 6, 8},smth.everySecondElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void everySecondElement2(){
        ForOperation smth = new ForOperation();
        Assertions.assertArrayEquals( new int[]{2, 4, 6, 8},smth.everySecondElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void arrayRev(){
        ForOperation smth = new ForOperation();
        Assertions.assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, smth.arrayReversive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
