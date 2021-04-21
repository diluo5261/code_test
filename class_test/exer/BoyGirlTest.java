package day10.exer;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",25);
        System.out.println("name  "+boy.getName() + " age: "+boy.getAge());


        Girl girl = new Girl("朱丽叶",28);
        System.out.println("name  "+girl.getName() + " age: "+girl.getAge());

        //boy.marry(girl);
        girl.marry(boy);

        boy.shout();

        Girl girl2 = new Girl("刘亦菲",22);
        int compare = girl.compare(girl2);
        int compare2 = girl2.compare(girl);
        if (compare > 0){
            System.out.println(girl.getName() + "大");
        }else{
            System.out.println(girl2.getName()+ "大");
        }

        if (compare2 > 0){
            System.out.println(girl2.getName() + "大");
        }else{
            System.out.println(girl.getName()+ "大");
        }


    }
}
