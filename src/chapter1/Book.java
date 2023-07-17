package chapter1;

public class Book implements Cloneable { // 객체 지향 프로그래밍에서는 정보 은닉 관점에서 clone 사용을 유의해야 함.
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }

    @Override
    public boolean equals(Object obj) { // 기존 Object class에서의 equals는 인스턴스의 힙메모리 상의 주소값을 비교함

        if (obj instanceof Book) {
            Book book = (Book) obj;
            return book.title == this.title && book.author == this.author;
        }

        return false;
    }


    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
