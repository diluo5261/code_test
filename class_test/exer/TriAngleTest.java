package day10.exer;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle test = new TriAngle(100.2,55.5);
        System.out.println(test.Area());

        test.setBase(50);
        test.setHeight(50);

        System.out.println(test.getBase());
        System.out.println(test.getHeight());

        System.out.println(test.Area());
    }

}
