package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;

public class SearchEngineDecorator implements ISearchEngine {

    private ISearchEngine iSearchEngine;
    public SearchEngineDecorator(ISearchEngine iSearchEngine){
        this.iSearchEngine = iSearchEngine;
    }
    public long search (String text,String word){
        return iSearchEngine.search(text,word);
    }
}
