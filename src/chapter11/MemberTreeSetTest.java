package chapter11;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet treeSet = new MemberTreeSet();

        Member memberLee = new Member(1003, "이순신");
        Member memberKang = new Member(1001, "강감찬");
        Member memberKim = new Member(1002, "김유신");

        treeSet.addMember(memberLee);
        treeSet.addMember(memberKang);
        treeSet.addMember(memberKim);

        treeSet.showAllMembers();
    }
}
