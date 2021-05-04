package day13.exer;

public class Circle extends GeometricObject{
    private double radious;

    public Circle(String color, double weight, double radious) {
        super(color, weight);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double findArea(){
        return Math.PI*this.radious*this.radious;
    }
}
