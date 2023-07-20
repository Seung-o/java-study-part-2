package chapter10;

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
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return this.memberId == member.getMemberId();
        }
        return false;
    }

    @Override
    public String toString() {
        return memberName + "님의 아이디는 " + memberId + " 입니다.";
    }
}
