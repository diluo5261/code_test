package exer;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.creatList();
        list.display();
        System.out.println("链表的长度 : " + list.size());

        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(9);
        list.display();
        System.out.println("头插后链表的长度 : " + list.size());

        list.addLast(95);
        list.addLast(95);
        list.addLast(95);
        list.addLast(95);
        list.addLast(95);
        list.addLast(95);
        list.display();

        list.addIndex(0,0);
        list.addIndex(6,8888);
        list.display();

        System.out.println("是否包含 : " + list.contains(88888));
/*
        list.remove(8888);
        list.display();
        list.remove(659);
        list.remove(0);
        list.display();
        list.remove(0);*/

        list.removeAllKey(95);
        list.display();
    }
}
