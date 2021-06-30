package demo04.Supplier;

import java.util.function.Supplier;

/*
    Supplier<T> 接口仅包含一个无参方法：T get（）。用来获取一个泛型参数指定类型的对象数据。
    Supplier<T>接口被称之为生产型接口,指定接口泛型是什么类型,那么接口中的get方法就会产生什么类型的数据
 */
public class Demo01Supplier {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法,方法的参数是一个函数式接口,使用可以传递Lambda表达式
        String str = getString(()->{
            //生产一个字符串并返回
            return "hello";
        });
        System.out.println(str);

        //优化Lambda表达式
        String str2 = getString(()->"你好");
        System.out.println(str2);
    }


}
