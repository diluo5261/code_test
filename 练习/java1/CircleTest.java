package day14.java1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(3.0);

        System.out.println("c1的ID :" + c1.getId());
        System.out.println("c2的ID :"+ c2.getId());
        System.out.println("创建圆的个数为:" + Circle.getTotal());
    }

}

class Circle{
    private double radious;
    private int id;

    public Circle(){
        this.id = init++;
        total++;
    }

    public Circle(double radious) {
        this();
        this.radious = radious;
    }

    private static int total;//记录创建的圆的个数
    private static int init = 1001;//

    public double findArea(){
        return Math.PI * Math.pow(this.radious,2);
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}
