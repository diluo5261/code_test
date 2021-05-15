package doublelink;

public class DoubleLinkTest {
    public static void main(String[] args) {
        DoubleLink list = new DoubleLink();
//        list.addLast(12);
//        list.addLast(13);
//        list.addLast(14);
//        list.addLast(15);
//        list.display();

        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(12);

        list.removeAllKey(12);
        list.display();

//        list.addIndex(0,999);
//        list.addIndex(5,999);
//        list.addIndex(2,999);
//        list.display();
//
////        System.out.println(list.contains(1));
//
//        list.remove(15); list.display();
//        list.remove(12); list.display();
//        list.remove(999); list.display();


    }
}
