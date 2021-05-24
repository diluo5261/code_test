package three_interface;

import java.util.Comparator;

public class AgeComparator implements Comparator <Person> {


    //比较器
    @Override
    public int compare(Person o1, Person o2) {

        return o1.age - o2.age;
    }
}
