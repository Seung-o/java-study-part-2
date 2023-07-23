package chapter13;

class OutClass {
    private static final int sNum = 1;
    private final int num = 2;

    private final InnerClass innerClass;

    public OutClass() {
        innerClass = new InnerClass();
    }

    public void usingInTest() {
        innerClass.inTest();
    }

    static class InStaticClass {
        static int sInNum = 6;
        int inNum = 5;

        static void sInTest() {
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        void InTest() { // static 클래스이기에 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }

    class InnerClass { // Instance inner class
        static int sInNum = 3;
        int inNum = 4;

        static void sInTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }

        void inTest() {
            System.out.println(sNum);
            System.out.println(num);
            System.out.println(sInNum);
            System.out.println(inNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outer = new OutClass();
        outer.usingInTest();
        System.out.println("=========================");
        System.out.println(OutClass.InnerClass.sInNum);
        OutClass.InnerClass innerClass = outer.new InnerClass(); // private이 아닌 경우, 외부 클래스로부터 내부 클래스에 접근할 수 있다.
    }
}
