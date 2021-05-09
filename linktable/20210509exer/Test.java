package linktable;

public class Test {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.addLast(54);
        list.addLast(87);
        list.addLast(99);
        list.addFirst(2);
        list.addLast(55);
        list.addFirst(55);

        list.display();

        list.addIndex(2,188);
        list.addIndex(0,288);
        list.display();

//        list.remove(100);
//        list.display();
        System.out.println("**********************");
        list.removeAllKey(55);
        list.display();

        list.reverseList();
        list.display();

        System.out.println("******************");
        System.out.println(list.middleNode().val);

       /* list.clear();
        list.display();*/
    }
}
