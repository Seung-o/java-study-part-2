package chapter11;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("이순신");
        treeSet.add("강감찬");

        System.out.println(treeSet);
    }
}
