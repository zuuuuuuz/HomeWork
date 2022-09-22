package Home_Work_2.loops;

public class Main_1_6 {
    public static String multipleWithDino() {
        String str = "";
        str += "\t\t\t\t\t\t\t\tТаблица умножения";
        for (int i = 1; i <= 10; ++i) {
            for (int a = 2; a <= 5; ++a) {
                str += "  \t" + a + " x\t" + i + "\t=\t" + (a * i) + " ";
            }
            str += "\n";
        }
        str += "\n";
        for (int i = 1; i <= 10; ++i) {
            for (int a = 6; a <= 9; ++a) {
                str += "  \t" + a + " x\t" + i + "\t=\t" + (a * i) + " ";
            }
            str += "\n";
        }
        str += "\t\t\t\t\t\t\t\tЭто нужно знать!";
        str += "\t\t                       . - ~ ~ ~ - .\n" +
                "\t\t      ..     _      .-~               ~-.\n" +
                "\t\t     //|     \\ `..~                      `.\n" +
                "\t\t    || |      }  }              /       \\  \\\n" +
                "\t\t(\\   \\\\ \\~^..'                 |         }  \\\n" +
                "\t\t \\`.-~  o      /       }       |        /    \\\n" +
                "\t\t (__          |       /        |       /      `.\n" +
                "\t\t  `- - ~ ~ -._|      /_ - ~ ~ ^|      /- _      `.\n" +
                "\t\t              |     /          |     /     ~-.     ~- _\n" +
                "\t\t              |_____|          |_____|         ~ - . _ _~_";
        return str;
    }
}

