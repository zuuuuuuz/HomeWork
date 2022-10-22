package Home_Work_7.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingRegExSearch {
    @Test
    public void search9() {
        String word = "1-ая";
        String line = "-сухарик1-ая-сухарик-сухарик!1-ая!сухарик-сухарик !1-ая! -сухарик4 !х-с1-аяухарик-сухарик-сухарик-";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(line, word));
    }
    @Test
    public void search2() {
        String word = "сухарик";
        String line = "сухарики сухариксухарик сухарику";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }

    @Test
    public void search3() {
        String word = "сухарик";
        String line = "сухарик-сухарик-сухарик сухарика";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }


    @Test
    public void search10() {
        String word = "и";
        String line = "ИИИИИИИИ ВОТТТТТ и СЕЙЧАС И будет";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search13() {
        String word = "сухарик сухарик сухариксухарик";
        String line = "";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }
}
