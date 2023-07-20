package chapter11;

public class Member implements Comparable<Member> {
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


    @Override
    public int compareTo(Member member) {
        return this.memberId - member.getMemberId(); // 음수면 tree의 왼쪽 노드, 양수면 tree의 오른쪽 노드에 위치 ( -1을 곱하면 내림차순으로 변경됨 )
    }
}
