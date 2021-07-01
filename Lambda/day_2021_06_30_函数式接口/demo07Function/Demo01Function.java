package demo07Function;

import java.util.function.Function;

public class Demo01Function {
    /*
        定义一个方法,方法的参数传递一个字符串类型的整数
        方法的参数传递一个Function接口,泛型使用<string ,Integer>类型
        使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
     */
    public static void change(String str , Function<String , Integer> fun){
        int num = fun.apply(str);
        System.out.println(num);
    }

    public static void main(String[] args) {
        String s = "123564";
        change(s,str->Integer.parseInt(str));
    }
}
