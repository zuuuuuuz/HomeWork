package Home_Work_5.comparators;

import Home_Work_5.Person;

import java.util.Comparator;

public class ComparatorForPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPassword().length()-o2.getPassword().length()==0){
            return (o1.getNick().compareTo(o2.getNick()));
        }else {
            return o1.getPassword().length()-o2.getPassword().length();
        }
    }
}
