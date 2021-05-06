package day13.exer4;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.2);
        Circle c3 = new Circle("black",45,2.2);

        System.out.println("判断颜色是否相等 :" + c1.getColor().equals(c2));

        System.out.println("判断半径是否相等 :" + c2.equals(c3));

        System.out.println(c1.toString());


    }
}
