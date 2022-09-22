package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_5 {
    @Test
    public void whatChar(){
        Main4_5 smth = new Main4_5();
        Assertions.assertEquals("это не буква, а символ 7",
                smth.numberOrChar(55));
    }
    @Test
    public void whatChar2(){
        Main4_5 smth = new Main4_5();
        Assertions.assertEquals("это не буква, а символ Ý",
                smth.numberOrChar(221));
    }
    @Test
    public void whatChar3(){
        Main4_5 smth = new Main4_5();
        Assertions.assertEquals("это буква p",
                smth.numberOrChar(112));
    }
    @Test
    public void whatChar4(){
        Main4_5 smth = new Main4_5();
        Assertions.assertEquals("это не буква, а символ {",
                smth.numberOrChar(123));
    }

}
