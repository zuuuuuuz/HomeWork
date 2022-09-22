package Home_Work_5.comparators;

import Home_Work_5.Person;

import java.util.Comparator;

public class ComparatorForPassword implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getPassword().length()-o1.getPassword().length();
    }
}
