package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing6_3 {
    @Test
    public void welcomeVasya() {
        Updated_6_3 person = new Updated_6_3();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",person.welcom("Вася"));
    }
    @Test
    public void welcomeAnya() {
        Updated_6_3 person = new Updated_6_3();
        Assertions.assertEquals("Я тебя так долго ждал",person.welcom("Анастасия"));
    }
    @Test
    public void welcome() {
        Updated_6_3 person = new Updated_6_3();
        Assertions.assertEquals("Добрый день, а вы кто?", person.welcom("Аня"));
    }
}
