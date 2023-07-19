package chapter9;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private final ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {


        Iterator<Member> ir = arrayList.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }

        return false;
    }

    public void showAllMembers() {

        if (arrayList.isEmpty()) {
            System.out.println("MemberArrayList is empty");
            return;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            System.out.println(member.toString());
        }
    }
}
