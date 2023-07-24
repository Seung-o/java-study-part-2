package chapter15;

public class StringConcatImplTest {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        StringConcat concat2 = (str1, str2) -> { // 이 경우, 내부 클래스가 생성된다.
            System.out.println(str1 + ", " + str2);
        };

        concat2.makeString(s1, s2);

        StringConcat concat3 = new StringConcat() { // 함수형 인터페이스를 구현하고 사용할 때, 내부적으로 이런 프로세스가 발생한다.
            @Override
            public void makeString(String str1, String str2) {
                System.out.println(str1 + ", " + str2);
            }
        };

        concat3.makeString(s1, s2);
    }
}
