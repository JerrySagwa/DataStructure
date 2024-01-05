public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 创建测试用例链表
    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr cannot be empty!");
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; ++i) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val + " -> ");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}

