package Home_Work_2.loops;

public class Main_1_6 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\tТаблица умножения");
        for (int i = 1 ; i <= 10 ; ++i){
            for (int a = 2 ; a <= 5 ; ++a){
                System.out.print("  \t"+a+" x\t"+i+"\t=\t"+(a*i)+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= 10 ; ++i){
            for (int a = 6 ; a <= 9 ; ++a){
                 System.out.print("  \t"+a+" x\t"+i+"\t=\t"+(a*i)+" ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t\t\t\t\t\tЭто нужно знать!");
        System.out.println("\t\t                       . - ~ ~ ~ - .\n" +
                "\t\t      ..     _      .-~               ~-.\n" +
                "\t\t     //|     \\ `..~                      `.\n" +
                "\t\t    || |      }  }              /       \\  \\\n" +
                "\t\t(\\   \\\\ \\~^..'                 |         }  \\\n" +
                "\t\t \\`.-~  o      /       }       |        /    \\\n" +
                "\t\t (__          |       /        |       /      `.\n" +
                "\t\t  `- - ~ ~ -._|      /_ - ~ ~ ^|      /- _      `.\n" +
                "\t\t              |     /          |     /     ~-.     ~- _\n" +
                "\t\t              |_____|          |_____|         ~ - . _ _~_");
}
}
