package chapter20;

public class StudentTest {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getInstance();

        String name = null;

        try {
            Student student = new Student(name);
        } catch (StudentNameFormatException err) {
            logger.warning(err.getMessage());
        }

        try {
            name = "Edward Brown Kim General";
            Student student = new Student(name);
        } catch (StudentNameFormatException err) {
            logger.warning(err.getMessage());
        }

    }
}
