package Home_Work_4.container;

import Home_Work_4.DataContainer;
import Home_Work_4.StringComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingDataContainer {
    @Test
    public void add1() {
        String[] array = new String[0];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        Assertions.assertEquals(-1, dataContainer.add(null));
    }

    @Test
    public void add2() {
        String[] array = new String[0];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        Assertions.assertEquals(0, dataContainer.add("1"));
    }

    @Test
    public void add3() {
        String[] array = new String[1];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        Assertions.assertEquals(0, dataContainer.add("null"));
    }

    @Test
    public void add4() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        Assertions.assertEquals(0, dataContainer.add("null"));
    }

    @Test
    public void add5() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        Assertions.assertEquals(1, dataContainer.add("null"));
    }

    @Test
    public void add6() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("1");
        Assertions.assertEquals(2, dataContainer.add("null"));
    }

    @Test
    public void add7() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertEquals("[1, 2, 3]", dataContainer.toString());
    }

    @Test
    public void add8() {
        String[] array = new String[]{"1", null, "3"};
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("2");
        Assertions.assertEquals("[1, 2, 3]", dataContainer.toString());
    }

    @Test
    public void get1() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertNull(dataContainer.get(10));
    }

    @Test
    public void get3() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertEquals("2",dataContainer.get(1));
    }

    @Test
    public void get4() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertEquals("1",dataContainer.get(0));
    }

    @Test
    public void delete1() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertTrue(dataContainer.delete(0));
    }

    @Test
    public void delete2() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertTrue(dataContainer.delete(2));
    }

    @Test
    public void delete3() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertFalse(dataContainer.delete(3));
    }

    @Test
    public void delete5() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertTrue(dataContainer.delete("1"));
    }

    @Test
    public void delete6() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertFalse(dataContainer.delete("4"));
    }

    @Test
    public void delete7() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertFalse(dataContainer.delete(null));
    }

    @Test
    public void delete8() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        dataContainer.delete(1);
        Assertions.assertEquals("[1, 3]", dataContainer.toString());
    }

    @Test
    public void delete9() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        dataContainer.delete(2);
        Assertions.assertEquals("[1, 2]", dataContainer.toString());
    }

    @Test
    public void delete11() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        dataContainer.delete("2");
        Assertions.assertEquals("[1, 3]", dataContainer.toString());
    }

    @Test
    public void delete12() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        dataContainer.delete("12");
        Assertions.assertEquals("[1, 2, 3]", dataContainer.toString());
    }

    @Test
    public void delete13() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        dataContainer.delete("3");
        Assertions.assertEquals("[1, 2]", dataContainer.toString());
    }

    @Test
    public void toString1() {
        String[] array = new String[2];
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("1");
        dataContainer.add("2");
        dataContainer.add("3");
        Assertions.assertEquals("[1, 2, 3]", dataContainer.toString());
    }

    @Test
    public void sort1() {
        String[] array = new String[2];
        StringComparator stringComp = new StringComparator();
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("3");
        dataContainer.add("2");
        dataContainer.add("1");
        dataContainer.sort(stringComp);
        Assertions.assertEquals("[3, 2, 1]", dataContainer.toString());
    }

    @Test
    public void sort2() {
        String[] array = new String[2];
        StringComparator stringComp = new StringComparator();
        DataContainer<String> dataContainer = new DataContainer<>(array);
        dataContainer.add("333");
        dataContainer.add("22");
        dataContainer.add("1");
        dataContainer.add("null");
        dataContainer.sort(stringComp);
        Assertions.assertEquals("[1, 22, 333, null]", dataContainer.toString());
    }
}
