package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;
import Home_Work_7.dto.EasySearch;
import Home_Work_7.dto.RegExSearch;

import java.util.regex.Pattern;

public class SearchEngineCaseNormalizer extends SearchEngineDecorator{
    private ISearchEngine iSearchEngine;
    public String delimetrs="\\s*(\\s-|\\s|--|:|\\(|\\)|!|\"|;|'|\\*|,|\\?|\\.)\\s*";

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        super(iSearchEngine);
        this.iSearchEngine=iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (iSearchEngine instanceof EasySearch) {
            return super.search(text.toLowerCase(), word.toLowerCase());
        } else if (iSearchEngine instanceof RegExSearch) {
            Pattern withDel = Pattern.compile(delimetrs+word+delimetrs);
            return super.search(text.toLowerCase(),word.toLowerCase());
        }
        return -1;
    }

}
