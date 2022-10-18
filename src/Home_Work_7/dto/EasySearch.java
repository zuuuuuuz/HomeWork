package Home_Work_7.dto;

import Home_Work_7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    public String[] delimetrs = {" ", ".", "..", "...", "(", "--", "*", ")", "?", ",", "!", ";", ":", " -", "'", "\""};

    public long search(String text, String word) {
        long counter = 0;
        int value = 0;
        int length = delimetrs.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                boolean state = true;
                while (state) {
                    value = text.indexOf(delimetrs[i] + word + delimetrs[j], value + 1);
                    if (value != -1) {
                        counter++;
                    } else state = false;

                }
                value = -1;
            }
        }
        return counter;
    }
}
