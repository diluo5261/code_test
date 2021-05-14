//给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，
//且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null){
            return null;
        }
        ListNode frontStart = null;
        ListNode frontEnd = null;
        ListNode backStart = null;
        ListNode backEnd = null;
        
        while(pHead != null){
            if(pHead.val < x){
                if(frontStart == null){
                    frontStart = pHead;
                    frontEnd = pHead;
                    pHead = pHead.next;
                }else{
                    frontEnd.next = pHead;
                    frontEnd = frontEnd.next;
                    pHead = pHead.next;                    
                }  
            }else{
                if(backStart == null){
                    backStart = pHead;
                    backEnd = pHead;
                    pHead = pHead.next;
                }else{
                    backEnd.next = pHead;
                    backEnd = backEnd.next;
                    pHead = pHead.next;                    
                }
            }
        }
        
        if(frontStart == null){
            return backStart;
        }
        
        if(backStart != null){
            backEnd.next = null;
        }

        frontEnd.next = backStart;
        
        return frontStart;
    }
}