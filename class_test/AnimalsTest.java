package day10;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals a = new Animals();
        AnimalsTest a1 = new AnimalsTest();

        a.setAge(19);
        System.out.println(a.getAge());
        a.setLegs(18);
        System.out.println(a.getLegs());
        a.eat();


    }



}


class Animals{
    int age;
    private  int legs;

    public void setLegs(int n){
        if (n >0 && n %2 == 0){
            this.legs = n;
        }else{
            this.legs = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public  void eat(){
        System.out.println("eat!");
    }
}