package chapter5;

public class MyLinkedList {
    int count;
    private MyListNode head;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            MyListNode lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {

        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            System.out.println("Node를 추가할 수 없습니다. 현재 리스트 개수는 " + count + "개입니다.");
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;

        if (position < 0 || position > count) {
            System.out.println("Node를 추가할 수 없습니다. 현재 리스트 개수는 " + count + "개입니다.");
            return null;
        }

        if (position == 0) {
            head = tempNode.next;
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            preNode.next = tempNode.next;
        }

        count--;
        System.out.println(position + "번째 항목이 제거되었습니다.");
        return tempNode;
    }

    public void printAll() {

        MyListNode tempNode = head;
        String result = "";

        if (tempNode == null) {
            System.out.println("Empty List");
        }

        for (int i = 0; i < count; i++) {

            if (i == 0) {
                result = tempNode.getData();
            } else {
                result = result + "->" + tempNode.getData();
            }
            tempNode = tempNode.next;
        }

        System.out.println(result);
    }
}
