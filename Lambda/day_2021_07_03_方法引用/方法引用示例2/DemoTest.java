package java3;

import org.junit.Test;

//通过对象名引用成员方法
public class DemoTest {
    //定义一个方法,方法的参数传递Printable
    public static void printString(Printable p){
        p.print("hell0");
    }

    //1.传递接口的实现类
    public static void main(String[] args) {

        System.out.println("方法一:传递匿名内部类");
        printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        });

    //2.传入Lambda表达式
        System.out.println("方法二:传递Lambda");
        printString(s -> System.out.println(s));

        System.out.println("通过对象调用成员方法");
        printString(new Printable() {
            @Override
            public void print(String s) {
                MethodRerObject obj = new MethodRerObject();
                obj.printUpperCaseString(s);
            }
        });


        printString(s -> {
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用对象的成员方法
            obj.printUpperCaseString(s);
        });

        System.out.println("方法三:方法引用");
        /*
            对象已经存在MethodRerObject
            成员方法也存在,printUpperCaseObject
            我们可以使用对象名引用成员方法
         */
        MethodRerObject obj = new MethodRerObject();
        printString(obj :: printUpperCaseString);

    }


}
