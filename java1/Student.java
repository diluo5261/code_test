package day12.java1;

public class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println("学习专业是 : "+ this.major);
    }

    //对父类中的eat()进行了重写
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void show(){
        System.out.println("我是一名学生");
    }

}
