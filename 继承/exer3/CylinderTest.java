package day12.exer3;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(3);
        cy.setLength(5);
        System.out.println("圆的面积为:" + cy.findArea());

        System.out.println("圆的体积为:" + cy.findVolume());
    }
}
