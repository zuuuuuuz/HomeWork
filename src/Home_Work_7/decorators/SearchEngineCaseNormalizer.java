package Home_Work_7.decorators;

import Home_Work_7.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;
    private String lastSymbol;
   // public String delimetrs = "\\s*(\\s-|\\s|--|:|\\(|\\)|!|\"|;|'|\\*|,|\\?|\\.)\\s*";

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine, String lastSymbol) {
        this.iSearchEngine = iSearchEngine;
        this.lastSymbol = lastSymbol;
    }
    /*public long search(String str, Pattern word){
        long counter = 0;
        boolean state;
        Matcher match = word.matcher(str);
        while (match.find()){
            if ()
            if ()
        }
    }*/
    public long search(String text, String word) {
        if ((word.endsWith("а")) || word.endsWith("о") || word.endsWith("ю") || word.endsWith("у")
                || word.endsWith("ы") || word.endsWith("и") || word.endsWith("я") || word.endsWith("е")) {
            word = word.substring(0, word.length() - 1);
        }
        if ((word.endsWith("ом")) || word.endsWith("ею") || word.endsWith("ью") || word.endsWith("ем")
                || word.endsWith("ою") || word.endsWith("ой") || word.endsWith("ей") || word.endsWith("ым")
                || word.endsWith("ое") || word.endsWith("ее") || word.endsWith("ая") || word.endsWith("яя")
                || word.endsWith("ие") || word.endsWith("ые") || word.endsWith("их") || word.endsWith("ых")
                || word.endsWith("ую") || word.endsWith("юю") || word.endsWith("ый") || word.endsWith("ий")) {
            word = word.substring(0, word.length() - 2);
        }
        if ((word.endsWith("ого")) || word.endsWith("его") || word.endsWith("ому") || word.endsWith("ему")
                || word.endsWith("ыми") || word.endsWith("ими")) {
            word = word.substring(0, word.length() - 3);
        }

        text = text.replaceAll(word + "ого", word).replaceAll(word + "его", word).replaceAll(word + "ому", word)
                .replaceAll(word + "ему", word).replaceAll(word + "ыми", word).replaceAll(word + "ими", word)
                .replaceAll(word + "ом", word).replaceAll(word + "ею", word).replaceAll(word + "ью", word)
                .replaceAll(word + "ем", word).replaceAll(word + "ою", word).replaceAll(word + "ой", word)
                .replaceAll(word + "ей", word).replaceAll(word + "ым", word).replaceAll(word + "ое", word)
                .replaceAll(word + "ее", word).replaceAll(word + "ая", word).replaceAll(word + "яя", word)
                .replaceAll(word + "ие", word).replaceAll(word + "ые", word).replaceAll(word + "их", word)
                .replaceAll(word + "ых", word).replaceAll(word + "ую", word).replaceAll(word + "юю", word)
                .replaceAll(word + "ый", word).replaceAll(word + "ий", word).replaceAll(word + "а", word)
                .replaceAll(word + "о", word).replaceAll(word + "ю", word).replaceAll(word + "у", word)
                .replaceAll(word + "ы", word).replaceAll(word + "и", word).replaceAll(word + "я", word)
                .replaceAll(word + "е", word);
        return iSearchEngine.search(text,word+lastSymbol);
    }
}

