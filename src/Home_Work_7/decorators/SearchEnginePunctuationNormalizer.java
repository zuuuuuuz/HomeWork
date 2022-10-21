package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{
    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine){
        this.iSearchEngine=iSearchEngine;
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

    @Override
    public long search(String text, String word) {
        remover(text);
        return iSearchEngine.search(text,word);
    }
}
