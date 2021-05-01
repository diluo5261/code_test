package day12.java2;

public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;


    private void methodPrivate(){
        System.out.println("************private method************");
        orderPrivate = 1;
        orderDefault = 3;
        orderProtected = 4;
        orderPublic = 5;
    }


     void methoddefault(){
         System.out.println("************default method************");
        orderPrivate = 1;
        orderDefault = 3;
        orderProtected = 4;
        orderPublic = 5;
    }

    protected void methodProtected(){
        System.out.println("************protected method************");
        orderPrivate = 1;
        orderDefault = 3;
        orderProtected = 4;
        orderPublic = 5;
    }

    public void methodPublic(){
        System.out.println("************public method************");
        orderPrivate = 1;
        orderDefault = 3;
        orderProtected = 4;
        orderPublic = 5;
    }

    public void show(){
        System.out.println("orderprivate = " + this.orderPrivate);
        System.out.println("orderdefault = " + this.orderDefault);
        System.out.println("orderprotected = " + this.orderProtected);
        System.out.println("orderpublic = " + this.orderPublic);
    }


}
