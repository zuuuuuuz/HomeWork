package Home_Work_4.container;

import Home_Work_4.IntegerComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingIntegerComparator {
    @Test
    public void compare1() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 > sc.compare(111, 3242));
    }

    @Test
    public void compare2() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertEquals(0, sc.compare(2, 2));
    }

    @Test
    public void compare3() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 < sc.compare(77, 3));
    }
}
