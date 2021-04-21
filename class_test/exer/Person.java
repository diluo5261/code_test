package day10.exer;

public class Person {
    private int age;
    private String name;

    public Person(int age){
        this.age = age;
    }


    public Person(String name, int age){
        this(age);
        this.name = name;

    }

    public void steAge(int age){
        if(age > 0 && age <150) {
            this.age = age;
        }
        return;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
