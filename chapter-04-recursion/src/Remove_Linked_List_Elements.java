import java.util.List;

// LC 203
public class Remove_Linked_List_Elements {


    public ListNode removeElements(ListNode head, int val) {
        // 设置虚拟头节点来统一所有节点的操作
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;
        ListNode cur = dummyHead.next;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur.next = null;
                cur = prev.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    public ListNode removeElementsRecursive(ListNode head, int val) {
        if (head == null)
            return null;
        head.next = removeElementsRecursive(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        Remove_Linked_List_Elements s = new Remove_Linked_List_Elements();
        s.removeElementsRecursive(head, 4);
        System.out.println(head);
    }
}






























