package chapter6;

import chapter4.MyArray;

public class MyStack {
    int top;
    MyArray stack;

    public MyStack() {
        top = 0;
        stack = new MyArray();
    }

    public MyStack(int size) {
        top = 0;
        stack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        stack.addElement(data);
        top++;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack is Empty!");
            return MyArray.ERROR_CODE;
        }

        return stack.removeElement(--top);
    }

    public boolean isFull() {
        return top == stack.ARRAY_CAPACITY;
    }

    public void printAll() {
        stack.printAll();
    }
}
