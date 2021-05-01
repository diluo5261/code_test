package day12.java3;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        System.out.println("***************************");
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.printName();
        man.earnMoney();

        System.out.println("***************************");
        Woman woman = new Woman();
        woman.eat();

        System.out.println("***********多态性*************");
        Person p2 = new Man();
        p2.eat();
        p2.walk();


        Person p3 = new Woman();
        p3.walk();

        System.out.println(p2.id);


    }

}
