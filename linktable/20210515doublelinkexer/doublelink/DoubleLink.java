package doublelink;

import java.util.List;

class ListNode{
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

public class DoubleLink {

    ListNode head = null;
    ListNode last = null;


    //头插法
    public void addFirst(int val){
        ListNode node = new ListNode(val);

        if (head == null){
            head = node;
            last = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }

    }

    //尾插法
    public void addLast(int val){
        ListNode node = new ListNode(val);
        if (this.head == null){
            this.head = node;
            this.last = node;
        }else{
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    //在任意位置插入;
    public void addIndex(int index, int val){
        if (index < 0 || index >size()){
            System.out.println("position error!");
            return ;
        }

        if (index == 0) {
            addFirst(val);
            return ;
        }

        if (index == size()) {
            addLast(val);
            return;
        }

        ListNode node = new ListNode(val);
        ListNode cur = searchIndex(index);

        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev= node;

    }

    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //是否包含关键字
    public boolean contains(int key){
        ListNode  cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur =cur.next;
        }
        return false;
    }

    //删除第一次出现节点的位置
    public void remove(int key){
        ListNode cur = this.head;
        while(cur != null){
            if (cur.val == key) {
                if (cur == this.head){//删除头节点
                    cur.next.prev = null;
                    head = head.next;
                }else{
                    //删除中间或尾节点
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = cur.prev;
                    }else{
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }else{
            cur =cur.next;
            }
        }
    }
    //删除所有节点
    //删除第一次出现节点的位置
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while(cur != null){
            if (cur.val == key) {
                if (cur == this.head) {//删除头节点
                    head = head.next;
                    if (this.head != null){
                        head.prev = null;
                    }else{
                        last = null;
                    }


                } else {
                    //删除中间或尾节点
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = cur.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
            }

            cur =cur.next;
        }
    }
    //求列表的长度
    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    //遍历整个列表
    public void display(){
        ListNode cur =this.head;
        while(cur != null){
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
        System.out.println("************************");
    }

    //清空列表
    public void clear(){
        ListNode cur = this.head;

        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.head = null;
        this.last = null;

    }
}
