package chapter9;

public class Member {
    private final int memberId;
    private final String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return memberName + "님의 아이디는 " + memberId + " 입니다.";
    }
}
