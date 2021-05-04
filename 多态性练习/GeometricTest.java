package day13.exer;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("black",1.0,2.3);
        test.displayGeometricObject(c1);

        Circle c2 = new Circle("black",1.0,3.3);
        test.displayGeometricObject(c2);

        System.out.println(test.equalsArea(c1, c2));

    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为 : " + o.findArea());
    }
}
