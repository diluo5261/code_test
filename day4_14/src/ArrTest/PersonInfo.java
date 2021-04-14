package ArrTest;

public class PersonInfo {
    //属性
    String name;
    int age;
    /**
     * 1表示男性
     * 0表示女性
     * */
    int sex;
    //方法
    public  void study(){
        System.out.println("studying");
    }

    public  void showAge(){
        System.out.println("age: "+ age);
    }

    public  int addAge(int i){
        age += i;
        return age;
    }
}
