package chapter11;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private final TreeSet<Member> hashSet;

    public MemberTreeSet() {
        hashSet = new TreeSet<>();
    }


    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {


        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }

        return false;
    }


    public void showAllMembers() {

        if (hashSet.isEmpty()) {
            System.out.println("MemberArrayList is empty");
            return;
        }

        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            System.out.println(member.toString());
        }
    }
}
