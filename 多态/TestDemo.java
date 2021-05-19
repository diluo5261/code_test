package 多态;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.scene.shape.Circle;

public class TestDemo {


    public static void drawShapes1(){
        Rect r1 = new Rect();
        Cycle c1 = new Cycle();
        Triangle t1 = new Triangle();

        String [] shapes = {"circle","rect","triangle"};
        for (String shape:shapes) {
            if (shape.equals("circle")){
                System.out.println("圆形");
            }else if (shape.equals("rect")){
                System.out.println("方形");
            }else if (shape.equals("triangle")){
                System.out.println("三角形");
            }

        }

    }

    public static void drawShapes() {
        Rect r1 = new Rect();
        Triangle t1 = new Triangle();
        Cycle c1 = new Cycle();

        Shape[] shapes = {r1,t1,c1};
        for (Shape shape:shapes ) {
            shape.draw();
        }
    }



    public static void main(String[] args) {

        //1、创建子类对象
//        Triangle t1 = new Triangle();
//        Rect r1 = new Rect();
//        Cycle c1 = new Cycle();
//        t1.draw();
//        r1.draw();
//        c1.draw();
        /*Shape t2 = new Triangle();
        Shape r2 = new Rect();
        t2.draw();
        r2.draw();*/
//        drawShapes1();
        drawShapes();




    }
}


class Shape{
    public void draw(){

    }
}

class Rect extends Shape{
    public void draw(){
        System.out.println("方形");
    }
}

class Cycle extends Shape {
    public void draw(){
        System.out.println("圆形");
    }
}

class Triangle extends  Shape{
    public  void draw(){
        System.out.println("三角形");
    }
}