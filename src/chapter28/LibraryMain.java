package chapter28;

import java.util.ArrayList;

class Library {
    private final ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (shelf.isEmpty()) {
            System.out.println("Wait start");
            wait();
            System.out.println("Wait end");
        }

        String book = shelf.remove(0);
        System.out.println(t.getName() + " lends " + book);
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println("Notify");
        System.out.println(t.getName() + " returns " + book);
    }
}

class Student extends Thread {
    public void run() {
        try {
            String book = LibraryMain.library.lendBook();
            Thread.sleep(5000);
            LibraryMain.library.returnBook(book);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class LibraryMain {
    public static Library library = new Library();

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();

        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
        student6.start();
        student7.start();
        student8.start();
        student9.start();
        student10.start();
    }
}
