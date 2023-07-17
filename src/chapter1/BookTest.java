package chapter1;


public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("태백 산맥", "조정래");
        System.out.println(book1);
        System.out.println(book1);

        Integer integer = Integer.valueOf(100);
        System.out.println(integer); // 100이 프린트됨. ( toString이 이미 override 되어 있음 )

        Book book2 = new Book("태백 산맥", "조정래");
        Boolean physicalEqual = book1 == book2;
        Boolean logicalEqual = book1.equals(book2);
        System.out.println("physicalEqual: " + physicalEqual);
        System.out.println("logicalEqual: " + logicalEqual);

        Book book3 = book1.clone();
        System.out.println(book1);
    }

}
