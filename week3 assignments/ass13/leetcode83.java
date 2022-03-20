package ass13;

public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode cur = head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode prev = newHead;
        cur = cur.next;
        prev = head;
        while(cur != null){
            if(cur.val == prev.val){
                prev.next = cur.next;
                cur = cur.next;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
