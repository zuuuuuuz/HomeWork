package Home_Work_7.dto;

import Home_Work_7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    public final String[] delimetrs = {" ", ".", "..", "...","«","»", "(", "--", "*", ")", "?", ",", "!", ";", ":", " -", "'", "\""};

    public long search(String text, String word) {
        long counter = 0;
        int value = 0;
        int length = delimetrs.length;
        for (String delimetr : delimetrs) {
            for (String delimetr2 : delimetrs) {
                boolean state = true;
                while (state) {
                    value = text.indexOf(delimetr + word + delimetr2, value + 1);
                    if (value != -1) {
                        counter++;
                    } else state = false;

                }
            }
        }
        return counter;
    }
}
