package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_1 {
    @Test
    public void Even(){
        Main4_1 number = new Main4_1();
        Assertions.assertEquals(true, number.evenOrOdd(2));
    }
    @Test
    public void Odd(){
        Main4_1 number = new Main4_1();
        Assertions.assertEquals(false, number.evenOrOdd(1));
    }
    @Test
    public void evenOrOdd1(){
        Main4_1 number = new Main4_1();
        Assertions.assertEquals(false, number.evenOrOdd(3));
    }
    @Test
    public void evenOrOdd2(){
        Main4_1 number = new Main4_1();
        Assertions.assertEquals(false, number.evenOrOdd(-1));
    }
    @Test
    public void evenOrOdd3(){
        Main4_1 number = new Main4_1();
        Assertions.assertEquals(true, number.evenOrOdd(-6));
    }
}
