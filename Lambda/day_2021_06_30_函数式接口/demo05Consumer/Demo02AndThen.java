package demo05.Consumer;

import java.util.function.Consumer;

/*
Consumer接口默认方法andThen
作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,再对数据进行消费
例如:
Consumer <String> con1;
Consumer <String> con2
String s = "hello";
con1.accept(s);
con2.accept(s);

连接两个Consumer接口,再进行消费
con1.andThen(con2).accept(s);
 */
public class Demo02AndThen {
        //定义一个方法,方法的参数传递一个字符和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void method(String str, Consumer<String> con1, Consumer<String> con2){
        //方法一
//        con1.accept(str);
//        con2.accept(str);

        //方法二:使用andThen方法,连接两个Consumer接口,再进行消费
        con1.andThen(con2).accept(str);
    }

    public static void main(String[] args) {
        //调用method方法,传递一个字符串,两个Lambda表达式
        method("Hello",str -> {
                    //消费方式:把字符串转换为大写输出
                    System.out.println(str.toUpperCase());
                }
                ,str -> {
                    //消费方式:把字符串转换为小写输出
                    System.out.println(str.toLowerCase());
                });
    }
}
