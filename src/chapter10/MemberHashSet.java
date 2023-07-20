package chapter10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private final HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
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
