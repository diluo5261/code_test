package demo06Predicate;
/*
作用:对于某种数据类型的数据进行判断,结果返回一个boolean值

Predicate 接口中含有一个抽象方法:
boolean test( T t ) :用来对指定数据类型进行判断的方法
结果:符合条件:true
    不符合条件:false

 */

import java.util.function.Predicate;

public class Demo01Predicate {
    /*
    定义一个方法
    参数传递一个String类型的字符串
    传递一个Predicate 接口,泛型使用String
    使用Predicate中的方法test对字符串进行判断,并将结果返回
     */

    public static boolean checkString(String str, Predicate<String> pre){
        return pre.test(str);
    }

    public static void main(String[] args) {
        String str = "adcbds";
        //判断字符串的长度是否大于5
        boolean flag = checkString(str,s -> s.length() > 5);
        System.out.println(flag);
    }
}
