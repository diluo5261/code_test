//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
// 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode cur = pHead;
        ListNode newHead = new ListNode(0);
        ListNode tmp = newHead;
        
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                tmp.next = cur;
                tmp =cur;
                cur =cur.next;
            }
        }
        tmp.next = null;
       return newHead.next;
    }
}