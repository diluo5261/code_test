package day12.java2;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.methoddefault();
        order.show();


        order.methodProtected();
        order.show();

        order.methodPublic();
        order.show();


        System.out.println("******************************");
        order.orderPublic = 9;
        order.orderProtected = 23;
        order.orderDefault = 88;
        order.show();
    }

}
