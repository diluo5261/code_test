package exer;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public  ListNode(int val){
        this.val = val;
    }
}

public class MyLinkList {

    public ListNode head;

    //头插法:
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;

        if (this.head == null) {
            this.head = node;
            return;
        }

        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = node;
    }

    //在任意位置插入一个下表
    public void addIndex(int index, int data){
        if (index < 0 || index > this.size()) {
            System.out.println("下标错误!");
            return ;
        }

        if (index == 0) {
            this.addFirst(data);
            return;
        }else if (index == this.size()){
            this.addLast(data);
            return;
        }


        ListNode pre = this.head;
        int count = 0;

        while(count != (index-1)){
            pre = pre.next;
            count++;
        }

        ListNode node = new ListNode(data);
        node.next = pre.next;
        pre.next = node;

    }

    //查找key是否包含在链表中
    public  boolean contains(int key){
        if (this.head == null) {
            return false;
        }

        ListNode cur = this.head;
        while(cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null){
            System.out.println("链表为空,无法删除!");
            return;
        }

        if (!contains(key)){
            System.out.println("无此数据!");
            return;
        }

        if (this.head.val == key){
            this.head = this.head.next;
            return;
        }

        ListNode cur = this.head.next;
        ListNode pre = this.head;
        while (cur.next != null){
            if (cur.val == key){
                break;
            }
            cur = cur.next;
            pre = pre.next;
        }

        pre.next = cur.next;
        cur.next = null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null){
            System.out.println("链表为空!无删除数据!");
        }

        ListNode pre = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }

        if (this.head.val == key) {
            this.head = this.head.next;
        }
    }

    //获得链表的长度
    public int size(){
        if (this.head == null) {
            return -1;
        }
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display(){
        ListNode cur = this.head;

        while (cur != null) {

            System.out.println(cur.val +" ");
            cur = cur.next;
        }
        System.out.println("打印完毕!\n****************************");
    }

    public void clear(){
        while(this.head == null){
            System.out.println("链表已清空,无需再次清空!");
        }

        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;

    }

    public void creatList(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        this.head = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
    }
}
