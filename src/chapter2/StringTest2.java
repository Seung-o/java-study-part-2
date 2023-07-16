package chapter2;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));  // 798154996

        java = java.concat(android); // String Class의 문자열은 final로 선언되어 있어서 바뀔 수 없음.이 경우, 새로운 메모리를 할당해야 함. ( 메모리 낭비 발생 )
        System.out.println(java);
        System.out.println(System.identityHashCode(java)); // 681842940
    }
}
