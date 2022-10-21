package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;

public class SearchEngineRegisterNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public SearchEngineRegisterNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }
    @Override
    public long search(String text, String word) {
        text=text.toLowerCase();
        word=word.toLowerCase();
        return iSearchEngine.search(text,word);
    }
}
