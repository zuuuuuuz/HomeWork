package Home_Work_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_4 {
    @Test
    public void bytToKb(){
        Main4_4 smth = new Main4_4();
        Assertions.assertEquals(1.0, smth.toKbt(1024));
    }
    @Test
    public void bytToKb2(){
        Main4_4 smth = new Main4_4();
        Assertions.assertEquals(2.0, smth.toKbt(2048));
    }
    @Test
    public void bytToKb3(){
        Main4_4 smth = new Main4_4();
        Assertions.assertEquals(0.0, smth.toKbt(0));
    }
    @Test
    public void kbToByt(){
        Main4_4 smth = new Main4_4();
        Assertions.assertEquals(2048, smth.toByt(2));
    }
    @Test
    public void kbToByt1(){
        Main4_4 smth = new Main4_4();
        Assertions.assertEquals(1024, smth.toByt(1));
    }
}