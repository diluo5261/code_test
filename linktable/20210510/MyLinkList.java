package exer2;


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

    public void display(ListNode newHead){
        ListNode cur = newHead;
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

    public void clear(){
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }

        this.head = null;
        System.out.println("清空完成!");
    }

    //********************************************

    /**
     * 删除节点的上一个节点
     * @param key
     * @return 找到返回上一个节点的地址,没找到返回null
     */
    private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.val == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //当删除节点为头节点时
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }

        //删除节点不为头节点时,先找删除节点的上一个节点

        ListNode prev = searchPrev(key);
        if (prev == null){
            System.out.println("没有此节点!");
            return;
        }

        ListNode del = prev.next;
        prev.next = del.next;
    }

    //寻找删除节点的前一个节点
   /* private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while (prev != null) {
            if (prev.next.val == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //头节点
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        //找到要删除节点的前驱节点
        ListNode pre = searchPrev(key);

        if (pre == null) {
            System.out.println("没有要删除的节点!");
            return;
        }
        //开始删除节点
        ListNode del = pre.next;
        pre.next = del.next;
        System.out.println("删除完成");
    }*/
    //删除值为key的所有节点(只遍历一遍)
    public void removeAllKey(int key){
//        if (head == null) return;
        ListNode prev = this.head;
        ListNode del = this.head.next;

        while (del != null) {
            if (del.val == key) {
                prev.next =del.next;
                del = del.next;

            }else{
                prev = del;
                del =del.next;
            }
        }

        if (this.head.val == key) {
            this.head =this.head.next;
        }

      /*  ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //这个if语句 如果放到前面 必须是循环
        if (this.head.val == key) {
            this.head = this.head.next;
        }*/
       /* ListNode pre = this.head;
        ListNode del = this.head.next;

        while (del != null) {
            if (del.val == key){
                pre.next = del.next;
                del = del.next;
            }else{
                pre = del;
                del = del.next;
            }

        }

        if (this.head.val == key){
            this.head = this.head.next;
        }*/

    }

    //反转一个单列表"
    public ListNode reverseList(){
        if (this.head == null){
            return null;
        }

        if (this.head.next == null) {
            return this.head;
        }

        ListNode cur = this.head;
        ListNode curNext = this.head.next;

        cur.next = null;
        cur = curNext;

        while (cur != null) {
            curNext = curNext.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return this.head;
    }

    //定义一个头节点为
    public ListNode middleNode(){
        ListNode slow = this.head;
        ListNode fast = this.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，
    // 且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
    public ListNode partition(int x){
        ListNode cur = this.head;
        ListNode frontStart = null;
        ListNode frontEnd = null;
        ListNode backStart = null;
        ListNode backEnd = null;

        while (cur != null) {
            if (cur.val < x) {
                if (frontStart == null) {
                    frontStart = cur;
                    frontEnd = cur;

                }else{
                    frontEnd.next = cur;
                    frontEnd = cur;
                }
            }else{
                if (backStart == null){
                    backStart = cur;
                    backEnd = cur;
                }else{
                    backEnd.next = cur;
                    backEnd = cur;
                }
            }
            cur = cur.next;
        }

        if (frontStart == null) {
            return backStart;
        }

        frontEnd.next = backStart;
        if (backStart != null) {
            backEnd.next = null;
        }

        return frontStart;
    }

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode cur = pHead;
        ListNode newHead = new ListNode();
        ListNode tmp = newHead;

        while(cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead;
    }

    public boolean chkPalindrome(ListNode A) {
        ListNode slow = this.head;
        ListNode fast = this.head;

        //1、找中间节点
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转
        ListNode cur = slow.next;

        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、一个从前往后，一个从后往前
        while(head != slow){
            if (head.val != slow.val) {
                return false;
            }
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;

    }



}
