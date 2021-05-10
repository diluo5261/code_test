package exer2;
class ListNode {
    public int val;//值
    public ListNode next;//存储下一个节点的地址  也就是说 这个是一个引用

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

}
public class TestDemo {
    public static void main(String[] args) {
        MyLinkList myLinkedList = new MyLinkList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(36);
        myLinkedList.addLast(1);
        myLinkedList.display();

        MyLinkList myLinkedList2 = new MyLinkList();
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(6);
        myLinkedList2.addLast(8);
        myLinkedList2.addLast(14);
        myLinkedList2.addLast(34);
        myLinkedList2.display();


        creteCut(myLinkedList.head,myLinkedList2.head);
        ListNode ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head);
        if(ret == null) {
            System.out.println("没有相交!");
        }else {
            System.out.println(ret.val);
        }
    }

}

    public static void creteCut(ListNode headA, ListNode headB) {
        headB.next.next = headA.next.next;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listLong = headA;
        ListNode listShort = headB;

        int lenLong = 0;
        int lenShort = 0;
        //求链表的长度

        while(listLong != null){
            lenLong += 1;
            listLong = listLong.next;
        }

        while(listShort != null){
            lenShort += 1;
            listShort = listShort;
        }

        listLong = headA;
        listShort = headB;

        int len = lenLong -lenShort;
        if(len < 0){
            len = lenShort -lenLong;
            listLong = headB;
            listShort = headA;
        }

        //让长链表先走len步
        while(len != 0){
            listLong = listLong.next;
            len =len -1 ;
        }

        //一起走到结尾
        while(listLong != listShort){
            listLong = listLong.next;
            listShort = listShort.next;
        }

        return listLong;

    }