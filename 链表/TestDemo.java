package 链表;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedLst test = new MyLinkedLst();
        test.createlist();
        test.display();
        System.out.println(test.size());
        test.addLast(58);
        test.addLast(98);
        test.display();

        test.addFirst(100);
        test.addFirst(101);
        test.display();

        test.addFirst(500);
        test.display();

        test.addLast(899);
        test.display();

    }
}
