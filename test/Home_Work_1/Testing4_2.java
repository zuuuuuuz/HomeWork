package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_2 {
    @Test
    public void compare1(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 2.0 является средним",
                smth.compare(1, 2, 3));
    }
    @Test
    public void compare2(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 2.0 является средним",
                smth.compare(3, 2, 1));
    }
    @Test
    public void compare3(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 2.2 является средним",
                smth.compare(2.2, 3, 2));
    }
    @Test
    public void compare4(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 2.0 является средним",
                smth.compare(1, 3, 2));
    }
    @Test
    public void compare5(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 777.0 является средним",
                smth.compare(666, 777, 999));
    }
    @Test
    public void compare6(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("число 9.0 является средним",
                smth.compare(111, 9, 1));
    }

    @Test
    public void compare7(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("Вы ввели одинаковые значения",smth.compare(111, 111, 111));
    }
    @Test
    public void compare8(){
        Main4_2 smth = new Main4_2();
        Assertions.assertEquals("Вы ввели одинаковые значения",smth.compare(1.1, 1.1, 1.1));
    }
}
