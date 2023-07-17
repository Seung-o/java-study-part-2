package chapter4;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_CAPACITY;
    public static final int ERROR_CODE = -9999;

    public MyArray(){
        count = 0;
        ARRAY_CAPACITY = 10;
        intArr = new int[ARRAY_CAPACITY];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_CAPACITY = size;
        intArr = new int[ARRAY_CAPACITY];
    }

    public int getSize(){
        return this.count;
    }

    public void addElement(int num) {
        if(count >= ARRAY_CAPACITY) {
            System.out.println("Not enough memory");
            return;
        }

        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        if(count >= ARRAY_CAPACITY) {
            System.out.println("Not enough memory");
            return;
        }

        if(position < 0|| position > count) {
            System.out.println("Insert Error");
            return;
        }

        for(int i = count-1; i>=position; i--) {
            intArr[i+1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        if(isEmpty()) {
            System.out.println("There is no element");
            return ERROR_CODE;
        }

        if(position < 0|| position > count) {
            System.out.println("Insert Error");
            return ERROR_CODE;
        }

        int result = intArr[position];

        for(int i = position; i < count; i++){
            intArr[i] = intArr[i+1];
        }

        count--;
        return result;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void printAll() {

        if(count==0) {
            System.out.println("빈 배열입니다.");
        }

        for(int i=0; i<count;i++) {
            System.out.println(intArr[i]);
        }
    }
}
