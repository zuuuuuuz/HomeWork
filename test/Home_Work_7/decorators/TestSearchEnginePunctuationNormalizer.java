package Home_Work_7.decorators;

import Home_Work_7.dto.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchEnginePunctuationNormalizer {
    @Test
    public void search1() {
        String line = "-!сухарик- --:--!:вкусный";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" сухарик    вкусный", easySearch.remover(line));
    }

    @Test
    public void search2() {
        String line = "-!сухарик- сухарик - -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" сухарик сухарик  ", easySearch.remover(line));
    }

    @Test
    public void search3() {
        String line = "-!--:сухарик-сухарик - -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals("  сухарик-сухарик  ", easySearch.remover(line));
    }

}
