import java.util.List;

public class Head {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        int cnt = 0;
        while (listNode1.next == null){
            cnt++;
            listNode1 = listNode1.next;
        }
        for (int i = 0; i < cnt / 2; i++) {
            listNode1 = listNode.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
