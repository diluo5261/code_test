package demo07Function;

/*
    Function接口中的默认方法andThen:用来进行组合
    把增加之后的Integer类型数据转换为String类型

    分析:
    转换了两次,
    第一次把String类型转换为Integer类型,
        我们可以使用Function<String,Integer> fun1
            int i = fun1.apply("123")+10;
    第二次是把Integer类型转换为String类型
        我们可以使用Function<Integer,String> fun2
            String str = fun2.apply(i);
    我们可以使用andThen方法,把两次转换组合在在一起使用
    String s = fun1.andThen(fun2).apply(str);

 */

import java.util.function.Function;

public class Demo02Function_andThen {
    public static void change(String str , Function<String,Integer> fun1,Function<Integer,String> fun2){
        String newStr = fun1.andThen(fun2).apply(str);
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String strNum = "156161";
        change(strNum,str -> Integer.parseInt(str)+10,i ->String.valueOf(i) );
        //change(strNum,str -> Integer.parseInt(str)+10,i ->i+"" );
    }
}
