package chapter10;


public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberHa = new Member(1, "하승오");
        Member memberO = new Member(2, "오지수");
        Member memberLee = new Member(3, "이순신");
        Member memberHong = new Member(4, "홍길동");
        Member memberKing = new Member(4, "킹콩");

        memberHashSet.addMember(memberHa);
        memberHashSet.addMember(memberO);
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(memberKing);

        memberHashSet.showAllMembers();

        memberHashSet.removeMember(memberHa.getMemberId());
        memberHashSet.removeMember(memberO.getMemberId());
        memberHashSet.removeMember(memberLee.getMemberId());
        memberHashSet.removeMember(memberHong.getMemberId());

        memberHashSet.showAllMembers();
    }
}
