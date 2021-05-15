package headdoublelink;

public class HeadDoubleLinkTest {
    public static void main(String[] args) {

        HeadDoubleLink list = new HeadDoubleLink();
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(2);
        list.display();
        System.out.println("*****************");

        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.display();
        System.out.println("**************");
        System.out.println("链表的长度: "+list.size());

        list.removeAllKey(2);
        list.display();
//        list.remove(3);
//        list.remove(88);
//        list.remove(90);
//        list.display();
//        list.addIndex(0,555);
//        list.display();
//        list.addIndex(7,777);
//        list.display();
//        list.addIndex(5,666);
//        list.display();
//
//        System.out.println(list.contains(90));
//        System.out.println(list.contains(689));
    }

}
