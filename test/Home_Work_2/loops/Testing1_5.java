package Home_Work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing1_5 {
    @Test
    public void maxNumber(){
        Assertions.assertEquals(9, Main_1_5.maxNumber(1234567890));
    }
    @Test
    public void maxNumber2(){
        Assertions.assertEquals(2, Main_1_5.maxNumber(122222222));
    }
    @Test
    public void fibonachi(){
        Assertions.assertEquals("Последовательность Фибоначчи: 1 2 3 5 8 13 21 34 55 89 144 233 377 610", Main_1_5.fibonachi(15));
    }
    @Test
    public void fibonachi2(){
        Assertions.assertEquals("Последовательность Фибоначчи: 1 2 3 5 8 13 21 34 55 89", Main_1_5.fibonachi(11));
    }
    @Test
    public void fibonachi3(){
        Assertions.assertEquals("Последовательность Фибоначчи: 1 2 3 5 8 13 21 34 55 89 144 233 377", Main_1_5.fibonachi(14));
    }
    @Test
    public void sstepByStep(){
        Assertions.assertEquals(" 20.0", Main_1_5.stepByStep(1, 20, 1));
    }
    @Test
    public void stepByStep2(){
        Assertions.assertEquals(" 23.0", Main_1_5.stepByStep(23, 23, 1111));
    }
    @Test
    public void stepByStep3(){
        Assertions.assertEquals(" 0.0",Main_1_5.stepByStep(0, 0, 21));
    }
    @Test
    public void perevorot(){
        Assertions.assertEquals("987654321", Main_1_5.perevorot(123456789));
    }
    @Test
    public void perevorot2(){
        Assertions.assertEquals("753745643", Main_1_5.perevorot(346547357));
    }
}
