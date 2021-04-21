package day10.exer;

public class TriAngle {

    private double base;
    private double height;

    public TriAngle(){

    }

    public TriAngle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void setBase(double base){

        if(base > 0){
            this.base = base;
        }
    }

    public double getBase(){
        return this.base;
    }

    public void setHeight(double height){
        if (height > 0){
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double Area(){
        return this.height * this.base/2.0;
    }
}
