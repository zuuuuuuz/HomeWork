package Home_Work_7.decorators;

import Home_Work_7.dto.EasySearch;
import Home_Work_7.dto.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchEngineCaseNormalizer {

    @Test
    public void search1() {
        String word = "бабушка";
        String str = "бабушка бабушки бабушку";
        SearchEngineCaseNormalizer RegExSearch = new SearchEngineCaseNormalizer(new RegExSearch(), "а");
        Assertions.assertEquals(3, RegExSearch.search(str, word));
    }

    @Test
    public void search2() {
        String word = "пенал";
        String str = "авхах в пеналу и пенва ";
        SearchEngineCaseNormalizer easySearch = new SearchEngineCaseNormalizer(new EasySearch(), "а");
        Assertions.assertEquals(1, easySearch.search(str, word));
    }

    @Test
    public void search3() {
        String word = "пенал";
        String str = "пенк хахах пенала бабушка пеналу ";
        SearchEngineCaseNormalizer easySearch = new SearchEngineCaseNormalizer(new EasySearch(), "а");
        Assertions.assertEquals(2, easySearch.search(str, word));
    }


}
