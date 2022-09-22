package Home_Work_5.comparators;

import Home_Work_5.Animal;

import java.util.Comparator;

public class AgeCompareForAnimal implements Comparator<Animal>
{

    @Override
    public int compare(Animal o1, Animal o2) {

        return o2.getAge()- o1.getAge();
    }
}
