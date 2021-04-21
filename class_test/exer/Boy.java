package day10.exer;

public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        this.name = i;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int i){
        this.age = i;
    }

    public int getAge(){
        return this.age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶 " + girl.getName());
    }

    public void shout(){
        if(this.age > 22){
            System.out.println("可以合法登记结婚!");
        }else{
            System.out.println("还是先谈谈恋爱吧!");
        }

    }
}
