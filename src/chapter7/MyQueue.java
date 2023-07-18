package chapter7;

import chapter5.MyLinkedList;
import chapter5.MyListNode;

interface IQueue {
    void enQueue(String data);

    String deQueue();

    void printAll();
}

public class MyQueue extends MyLinkedList implements IQueue {

    MyListNode front;
    MyListNode rear;

    public MyQueue() {
        front = null;
        rear = null;
    }


    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }

        System.out.println("New element is added to queue: " + newNode.getData());
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }


        String data = front.getData();
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Element is deleted from queue: " + data);

        return data;
    }


    @Override
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }

        MyListNode temp = front;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }
}
