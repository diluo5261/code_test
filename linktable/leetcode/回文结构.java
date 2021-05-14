//对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
//给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构

public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        //找中间节点
        ListNode slow = A;
        ListNode fast = A;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //中间反转
        ListNode cur = slow;
        ListNode curNext;
        while(cur != null){
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        
        while(A != slow){
            if(A.val != slow.val){
                return false;
            }
            if(A.next == slow){
                return true;
            }
            A= A.next;
            slow = slow.next;
        }
        
        return true;
    }
}