package chapter12;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private final HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {

        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showAllMembers() {
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {
            Member member = hashMap.get(ir.next());
            System.out.println(member);
        }
    }
}
