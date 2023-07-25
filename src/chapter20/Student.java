package chapter20;

public class Student {
    private final String studentName;

    public Student(String studentName) throws StudentNameFormatException {
        if (studentName == null) {
            throw new StudentNameFormatException("Student Name cannot be null");
        }

        if (studentName.split(" ").length > 3) {
            throw new StudentNameFormatException("Student Name is too long");
        }

        this.studentName = studentName;
    }
}
