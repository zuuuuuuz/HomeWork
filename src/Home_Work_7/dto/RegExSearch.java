package Home_Work_7.dto;

import Home_Work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
        public final String delimetrs="\\s*(\\s-|\\s|--|:|\\(|\\)|!|\"|;|'|\\*|,|\\?|\\.)\\s*";

    public long search(String text,String word){
        int counter = 0;
        counter+=strFind(text, delimetrs+word+delimetrs);
        counter+=strFind(text,delimetrs+word+"$");
        counter+=strMatches(text,"^"+word+"$");
        counter+=strFind(text,"(?m)^"+word+delimetrs);
        return counter;
    }
    public long strFind(String str, String word){
        int counter=0;
        Pattern withDel = Pattern.compile(word);
        Matcher match = withDel.matcher(str);
        while (match.find()){
            counter++;
        }
        return counter;
    }
    public long strMatches(String str,String word){
        int counter=0;
        Pattern withDelimetr = Pattern.compile(word);
        Matcher words = withDelimetr.matcher(str);
        while (words.matches()){
            counter++;
        }
        return counter;
    }
}
