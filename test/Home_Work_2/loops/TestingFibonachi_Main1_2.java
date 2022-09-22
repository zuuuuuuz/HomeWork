package Home_Work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingFibonachi_Main1_2 {
    @Test
    public void fibont(){
        Main_1_2 smth = new  Main_1_2();
        Assertions.assertEquals("1*1*3*4*3*4*5=720",
                smth.fibonachi(1134345));
    }
    @Test
    public void fibon(){
        Main_1_2 smth = new  Main_1_2();
        Assertions.assertEquals("1*1*1*2*4*3*5*4*0=0",
                smth.fibonachi(111243540));
    }
    @Test
    public void input1(){
        Main_1_2 smth = new  Main_1_2();
        Assertions.assertEquals(false, smth.inputCheck("asdadas"));
    }
    @Test
    public void input2(){
        Main_1_2 smth = new  Main_1_2();
        Assertions.assertEquals(false , smth.inputCheck("nope "));
    }
    @Test
    public void inputCheck(){
        Main_1_2 smth = new  Main_1_2();
        Assertions.assertEquals(true,smth.inputCheck("13"));
    }


}
