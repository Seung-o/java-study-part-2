package chapter12;


public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHa = new Member(1, "하승오");
        Member memberO = new Member(2, "오지수");
        Member memberLee = new Member(3, "이순신");
        Member memberHong = new Member(4, "홍길동");
        Member memberKing = new Member(4, "킹콩");

        memberHashMap.addMember(memberHa);
        memberHashMap.addMember(memberO);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberKing);

        memberHashMap.showAllMembers();

        memberHashMap.removeMember(memberHa.getMemberId());
        memberHashMap.removeMember(memberO.getMemberId());

        memberHashMap.showAllMembers();
    }
}
