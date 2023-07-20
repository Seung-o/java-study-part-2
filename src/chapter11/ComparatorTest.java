package chapter11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());

        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);  // [c, b, a]
    }

}
