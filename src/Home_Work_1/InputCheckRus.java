package Home_Work_1;

public class InputCheckRus {
    public boolean inputCheckRusString (String a) {
        String abcd = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТМЬБЮ";
        int count = 0;
        int length = a.length();
        int length1 = abcd.length();
        //String str2=" ";
        for (int i = 0; i < length; i++) {
            String str = String.valueOf(a.charAt(i));
            for (int x = 0; x < length1; x++) {
                String str2= String.valueOf(abcd.charAt(x));
                if (str.equals(str2)) {
                    count++;
                }
            }
        }
        if (count == length) {
            return true;
        } else return false;
    }
}
