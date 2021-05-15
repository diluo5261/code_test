package headdoublelink;
class ListNode{
    int val;
    ListNode prev;
    ListNode next;

    public  ListNode(int val){
        this.val = val;
    }
}

public class HeadDoubleLink {
    ListNode head = new ListNode(-1);
    ListNode last = head;

    //头插法
    public void addFirst(int data){

        ListNode node = new ListNode(data);
        if (this.head.next == null){
            head.next = node;
            last = node;
        }else{
            node.next = head.next;
            node.prev = head.next.prev;
            head.next = node;
        }
    }

    //尾插法
    public void addLast(int data){

        ListNode node = new ListNode(data);

        if (head.next == null) {
            head.next = node;
            last = node;
        }else{
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    //在任意位置插入
    public void addIndex(int index, int data){
        if (index == 0){
            addFirst(data);
            return;
        }

        if (index == size()){
            addLast(data);
            return;
        }

        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }

    private ListNode searchIndex(int index){
        ListNode cur = this.head.next;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找链表是否包含关键字Key
    public boolean contains(int key){
        ListNode cur = this.head.next;
        while(cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字尾key的节点
    public void remove(int key){
        ListNode cur = this.head.next;

        while (cur != null) {
            if (cur.val == key){
                if (cur == head.next){
                    //头节点
                    head.next = cur.next;
                    cur.next.prev = null;
                }else {
                    if (cur.next == null) {
                        cur.prev.next = cur.next;
                        last = cur.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }else{
            cur = cur.next;
            }
        }
    }

    //删除所有为Key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head.next;

        while (cur != null) {
            if (cur.val == key){
                if (cur == this.head.next){
                    //头节点
                    head.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = null;
                    }else{
                        last = null;
                    }
                }else {
                    if (cur.next == null) {
                        cur.prev.next = cur.next;
                        last = cur.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }

    }

    public void clear(){
        ListNode cur = this.head.next;
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }

        this.head = null;
        this.last = null;
    }



    //得到链表的长度
    public int size(){
        ListNode cur = this.head.next;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }


    //遍历整个链表
    public void display(){
        ListNode cur = this.head.next;

        while(cur != null){
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
    }




}
