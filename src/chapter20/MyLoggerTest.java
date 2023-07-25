package chapter20;

public class MyLoggerTest {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getInstance();

        logger.log("test"); // Java JDK가 디폴트 로깅 레벨을 INFO로 잡고 있기 때문에, INFO 부터 터미널에 출력된다.
        // ~/Library/Java/JavaVirtualMachines/openjdk-%VERSION%/Contents/Home/conf/logging.properties 파일에서 이 디폴트 레벨을 수정할 수도 있다.
    }
}
