package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer extends SearchEngineDecorator{
    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine){
        super(iSearchEngine);
    }

    public String remover(String text){
        return text.replaceAll("\\."," ")
                .replaceAll(","," ")
                .replaceAll("!"," ")
                .replaceAll("\\?"," ")
                .replaceAll(";"," ")
                .replaceAll(":"," ")
                .replaceAll(" -"," ")
                .replaceAll("- "," ")
                .replaceAll("\\("," ")
                .replaceAll("\\)"," ")
                .replaceAll("\\n"," ");
    }
}
