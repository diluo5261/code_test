//输入一个链表，输出该链表中倒数第k个结点

public ListNode FindKthToTail(ListNode head,int k) {
        if(k < 0 || head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        int count = 0;
        while(count != k-1){
            if(fast.next == null){
                return null;
            }
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;

    }