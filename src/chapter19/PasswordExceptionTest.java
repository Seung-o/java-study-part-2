package chapter19;

public class PasswordExceptionTest {
    private String password;

    public static void main(String[] args) {
        PasswordExceptionTest test = new PasswordExceptionTest();
        String password = null;

        try {
            test.setPassword(password);
            System.out.println("No Error for case 1");
        } catch (PasswordException e) {
            System.out.println(e);
        }

        try {
            password = "abcd";
            test.setPassword(password);
            System.out.println("No Error for case 2");
        } catch (PasswordException e) {
            System.out.println(e);
        }

        try {
            password = "abcdefghijk";
            test.setPassword(password);
            System.out.println("No Error for case 3");
        } catch (PasswordException e) {
            System.out.println(e);
        }

        try {
            password = "abcde123";
            test.setPassword(password);
            System.out.println("No Error for case 4");
        } catch (PasswordException e) {
            System.out.println(e);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null이 될 수 없습니다.");
        }

        if (password.length() < 8) {
            throw new PasswordException("비밀번호는 8자 이상이어야 합니다.");
        }

        if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야만 합니다.");
        }


        this.password = password;
    }
}
