package Home_Work_2.loops;

public class Main1_4 {
    public long multipleMax(long userNumber){
        long number=1L;
        try {
            if (userNumber == 0 || userNumber == 1 || userNumber == -1) {
                throw new Exception("Переполнения не будет");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (userNumber>0) {
            while (number <= Long.MAX_VALUE / userNumber) {
                number *= userNumber;
            }

        }else {
            while (number>=Long.MAX_VALUE/userNumber){
                number *= userNumber;
            }
    }
        return number;
    }
}
