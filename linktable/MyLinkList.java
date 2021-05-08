package linktable;


import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val){
        this.val = val;
    }
}

public class MyLinkList {
    ListNode head;

    /**
     * 列表的遍历
     */
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 求链表的长度
     * @return
     */
    public int size(){
        ListNode cur = this.head;
        int count =0;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        head = node;
        System.out.println("头插入成功!");
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;

        if (this.head == null){
            this.head = node;
            return;
        }

        while(cur.next != null){
            cur = cur.next;
        }

        cur.next =node;
    }

    public void addIndex(int index,int data){
        if (index < 0 || index > size()){
            System.out.println("输入错误!");
            return;
        }

        if(index == 0){
            addFirst(data);
            return ;
        }

        if (index == size()){
            addLast(data);
            return;
        }

        ListNode node = new ListNode(data);
        ListNode cur = findIndexSubOne(index);
        node.next = cur.next;
        cur.next = node;
    }

    public ListNode findIndexSubOne(int index){
        ListNode cur = this.head;
        int count = 0;
        while(count != index - 1){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //********************************************
    //删除第一次出现关键字为key的节点



}
