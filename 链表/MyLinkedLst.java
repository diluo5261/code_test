package 链表;


import com.sun.org.apache.xpath.internal.objects.XNodeSet;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(){
    }

    public ListNode(int val){
        this.val = val;

    }

}
public class MyLinkedLst {

    public ListNode head;

        //当在实例化一个Listnode变量时,只能确定val的值
    public void createlist(){
        ListNode listnode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(45);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(8);
        ListNode listNode5 = new ListNode(5);

        listnode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        this.head = listnode1;
    }

    //遍历单链表中的每个元素
    public void display(){
        ListNode cur = new ListNode();
        cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //返回链表中数据的个数
    public int size(){
        ListNode cur = new ListNode();
        cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
    }

    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = new ListNode();
        cur = this.head;
        if (this.head == null){
            this.head = node;
            return ;
        }
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    public void addIndex(int index , int data){
        if (index < 0 || index > size()){
            System.out.println("index 不合法!");
            return;
        }

        if (index == 0){
            addFirst(data);
            return;
        }

        if (index == size()){
            addLast(data);
            return;
        }

        ListNode cur = findIndexSubOne(index);
        ListNode node = new ListNode(data);

        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 从0开始走index-1步
     */
    public ListNode findIndexSubOne(int index){
        ListNode cur = new ListNode();
        cur = this.head;
        int count = 0;
        while(count++ <index-1){
            cur = cur.next;
        }
        return cur;

    }

    public boolean contains(int key){
        ListNode cur = this.head;
        for (int i = 0; i <size() ; i++) {
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }



}
