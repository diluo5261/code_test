//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//方法一
public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode cur = head;
        ListNode curNext = head.next;

        cur.next = null;
        cur = curNext;

        while(cur != null){
            curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;

    }

//方法二:
public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;
        ListNode curNext = cur.next;

        while(cur != null){
            curNext = cur.next;
            if(curNext == null){
                head = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }

        return head;
}