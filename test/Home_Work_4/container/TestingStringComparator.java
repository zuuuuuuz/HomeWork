package Home_Work_4.container;

import Home_Work_4.StringComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingStringComparator {
    @Test
    public void compare1() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 > sc.compare("0", "2222"));
    }

    @Test
    public void compare2() {
        StringComparator sc = new StringComparator();
        Assertions.assertEquals(0, sc.compare("0", "1"));
    }

    @Test
    public void compare3() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 < sc.compare("0246", "1"));
    }
}
