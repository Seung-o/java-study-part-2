package chapter2;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        /**
         * 멀티 스레드 환경에서는 Synchronize를 보장하는 StringBuffer를 사용하기도 함.
         * 다만, StringBuffer는 스레드에 락을 걸고 해제하는 비용이 들기 때문에
         * 프로젝트의 스레드 환경에 따라서 적절한 클래스를 사용하면 됨.
         */
        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer)); // 798154996

        buffer.append(android);
        System.out.println(buffer.toString());
        System.out.println(System.identityHashCode(buffer)); // 798154996
    }
}
