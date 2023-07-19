package chapter9;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberHa = new Member(1, "하승오");
        Member memberO = new Member(2, "오지수");
        Member memberLee = new Member(3, "이순신");
        Member memberHong = new Member(4, "홍길동");

        memberArrayList.addMember(memberHa);
        memberArrayList.addMember(memberO);
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMembers();

        memberArrayList.removeMember(memberHa.getMemberId());
        memberArrayList.removeMember(memberO.getMemberId());
        memberArrayList.removeMember(memberLee.getMemberId());
        memberArrayList.removeMember(memberHong.getMemberId());

        memberArrayList.showAllMembers();
    }
}
