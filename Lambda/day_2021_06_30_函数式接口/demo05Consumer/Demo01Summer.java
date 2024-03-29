package demo05.Consumer;
/*
    Consumer 接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
    至于具体怎么消费(),需要自定义(输出,计算.....)
 */

import java.util.function.Consumer;

public class Demo01Summer {
    /*
    定义一个方法
    方法的参数传递一个字符串的名字
    方法的参数传递Consumer接口,泛型使用String
    可以使用Consumer接口消费字符串名字
     */

    public static void method(String name , Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用method方法,传递字符串姓名,方法的另一个参数是Consumer接口,是一个函数式接口,所以可以传递Lambda表达式
        method("迪丽热巴",(name) -> {
            //对传递的字符串进行消费,直接输出字符串
//            System.out.println(name);

            //消费方式:字符串进行反转
            String str = new StringBuilder(name).reverse().toString();
            System.out.println(str);
        });
    }
}
