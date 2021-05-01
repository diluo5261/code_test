package day12.exer2;

public class Person {
    String name;
    char sex;
    int age;


    public Person(){

    }
    public Person(String name,char sex , int age){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public String toString(){
        return name;
    }
}
