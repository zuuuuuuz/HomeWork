package Home_Work_7.dto;

import Home_Work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    //public int counter=0;
    public boolean state;
    public String delimetrs="\\s*(\\s-|\\s|--|:|\\(|\\)|!|\"|;|'|\\*|,|\\?|\\.)\\s*";

    public long search(String text,String word){
        int counter=0;
        Pattern withDel = Pattern.compile(delimetrs+word+delimetrs);
        Matcher match = withDel.matcher(text);
        while((state=match.find())){
            if (state){
                counter++;
            }

        }
        withDel= Pattern.compile(delimetrs+word+"$");
        match = withDel.matcher(text);
        if(match.find()){
            counter++;
        }

        Pattern withDelimetr = Pattern.compile("^"+word+"$");
        Matcher words = withDelimetr.matcher(text);
        if (words.matches()){
            counter++;
        }

        withDelimetr = Pattern.compile("(?m)^"+word+delimetrs);
        words = withDelimetr.matcher(text);
        if(words.find(0)){
            counter++;
        }


        return counter;
    }
}
