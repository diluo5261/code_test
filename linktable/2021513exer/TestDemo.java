package exer2;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.creatList();
        list.display();

        list.addFirst(100);
        list.addFirst(100);
        list.addLast(100);
        list.display();

        list.addLast(100);
        list.addLast(100);
        list.addLast(100);
        list.display();
        System.out.println("链表的长度: " + list.size());

        list.addIndex(0,100);
        list.addIndex(12,100);
        list.display();

        System.out.println("是否包含: " + list.contains(999));
        System.out.println("是否包含: " + list.contains(100));
        System.out.println("是否包含: " + list.contains(9959));

       /* list.remove(99);
        list.remove(100);
        list.remove(222111);
        list.remove(222);
        list.remove(111);
        list.remove(111222);
        list.remove(999);
        list.remove(999);
        list.display();*/

        list.removeAllKey(100);
        list.display();
        list.clear();
        list.display();



    }

}
