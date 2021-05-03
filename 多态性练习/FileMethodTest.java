package day13.exer1;

public class FileMethodTest {
    public static void main(String[] args) {
        sub s1 = new sub();
        System.out.println(s1.count); //20
        s1.show();  //20

        //多态性
        Base b1 = s1;
        System.out.println(b1.count); // 10
        b1.show();      //20

    }


}

class Base{
    int count = 10;

    public void show(){
        System.out.println(this.count);
    }

}

class sub extends Base{
    int count = 20;

    public void show(){
        System.out.println(this.count);
    }
}
