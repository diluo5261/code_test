package day13.exer4;

public class Circle extends GeometricObject {
    private double radious;

    public Circle() {
        this.radious = 1.0;
    }

    public Circle(double radious) {
        this.radious = radious;
    }

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
        return Math.PI * Math.pow(this.radious,2.0);
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radious == c.radious;
        }
        return false;
    }

    public String toString(){
        return "Circle [ radious = " + radious +"]";
    }
}
