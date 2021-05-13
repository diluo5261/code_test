package exer2;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

public class MyLinkList {
    ListNode head ;



//    //头插
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = this.head;
        this.head = node;
    }

//    //尾插
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        }

        ListNode cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }

        if (cur.next == null) {
            cur.next = node;
            return;
        }
    }


    private ListNode searchSubOne(int index){
        ListNode cur = this.head;
        int count = 0;
        while(count != index -1){
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入
    public boolean addIndex(int index ,int data){
        if (index < 0 || index > size()){
            System.out.println("index 数值错误!");
            return false;
        }
        //如果插在第一个位置,进行头插法
        if (index == 0){
            this.addFirst(data);
            return true;
        }
        //如果插在最后一个位置,进行尾插
        if (index == this.size()){
            this.addLast(data);
            return true;
        }

        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        ListNode pre = searchSubOne(index);

        pre.next = node;
        node.next = cur;
        return true;
    }

    //查找链表中是否包含关键字key
    public boolean contains(int key){
        ListNode cur =this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null) {
            System.out.println("链表为空!");
            return;
        }
        if (!this.contains(key)){
            System.out.println("链表无此数据!");
            return;
        }

        ListNode pre = this.head;
        ListNode cur = this.head.next;

        if (this.head.val == key) {
            this.head = cur;
            return;
        }

        while (cur.val != key) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;



    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null) {
            System.out.println("链表为空!");
            return;
        }

        if (!this.contains(key)){
            System.out.println("链表中不包含此数据!");
            return;
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

    //获取链表的长度
    public int size(){
        ListNode cur =this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;

    }

    public void display(){
        if (this.head == null) {
            System.out.println("链表为空!");
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
        System.out.println("遍历完成!");
        System.out.println("*********************");
    }

    public void clear(){
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

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        this.head = l1;

    }

}
