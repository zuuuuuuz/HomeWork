package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;
import Home_Work_7.dto.EasySearch;
import Home_Work_7.dto.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchEngineRegisterNomalizer {
    @Test
    public void search1() {
        String word = "сухарик";
        String line = "сухарик сухАрик сУхарИку";
        ISearchEngine RegExSearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(2, RegExSearch.search(line, word));
    }

    @Test
    public void search2() {
        String word = "сухАРик";
        String line = "сухариКСухарик СУхарик";
        ISearchEngine RegExSearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(1, RegExSearch.search(line, word));
    }

    @Test
    public void search3() {
        String word = "Сухарик";
        String line = "сухсмчАПикчс сухАРик";
        ISearchEngine RegExSearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(1, RegExSearch.search(line, word));
    }
}
