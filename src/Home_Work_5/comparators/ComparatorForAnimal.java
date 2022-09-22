package Home_Work_5.comparators;

import Home_Work_5.Animal;

import java.util.Comparator;

public class ComparatorForAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge()-o2.getAge()==0){
            return o1.getNick().compareTo(o2.getNick());
        }else if (o1.getAge()!=o2.getAge()){
            return o1.getAge() - o2.getAge();
        /*}
        else if (o1.getAge()==o2.getAge()) {
            String nick1=o1.getNick();
            String nick2=o2.getNick();

            if (nick1 == null){
                return -1;
            }else if (nick2==null){
                return 1;
            }
            int length2=nick1.length()-nick2.length();
            if(length2<0){
                length2=nick2.length();
            }else length2=nick1.length();
            for (int i = 0;i< length2;++i){
                int number = Integer.valueOf(nick1.charAt(i))-Integer.valueOf(nick2.charAt(i));
                if (number>0){
                    return 1;
                }else if (number<0){
                    return -1;
                }
            }*/
        }

        if (o1.getAge()-o2.getAge()==0){
            return o1.getNick().compareTo(o2.getNick());
        }else{
            return o1.getAge()- o2.getAge();
        }
    }

}
