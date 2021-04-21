package day10.exer;

public class Girl {
    private  String name;
    private  int age;

    public Girl(){

    }

    public Girl(String name,int age){
        this.age = age;
        this.name =name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给 " + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        return this.age - girl.age;
    }
}
