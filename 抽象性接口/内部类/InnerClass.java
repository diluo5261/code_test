package day15.内部类;

public class InnerClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Person.Dog dog = new Person.Dog();
        dog.show();

        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("***********************");
        bird.display("老家贼");


    }

}

class Person{
    String name = "人";
    int age;

    public Person(){

    }

    public void eat(){
        System.out.println("人吃饭！");
    }

    //静态内部类
    static class Dog{

        public void show(){
            System.out.println("卡拉是条狗!");
//            eat();
        }
    }
    //非静态内部类
    class Bird{
        String name = "燕子";
        public void sing(){
            System.out.println("小鸟在唱歌！");
            eat();
            Person.this.eat();
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }

    }


}
