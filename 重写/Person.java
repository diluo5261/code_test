package day12.java1;

public class Person {
    String name;
    int age;
    public Person(){

    }

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    void eat(){
        System.out.println("吃饭");
    }

    public void walk(int distance){
        System.out.println("走路的距离是: " + distance + "公里");
        show();
        this.eat();
    }

    private void show(){
        System.out.println("我是一个人!");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }
}
