package day12.exer3;

public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public void setRadius(double radious){
        this.radius = radious;
    }

    public double getRadius(){
        return this.radius;
    }

    public double findArea(){
        return Math.PI * this.radius*this.radius;
    }
}
