package demo07Function;

import java.util.function.Function;

/*
    1.将字符串截取数字年龄部分,得到字符串
    Function<String ,String> "赵丽颖,20" --> "20"
    2.将上一步的字符串转换为int类型的数字
    Function<String,Integer> "20" --> 20
    3.将上一步的int数字累加到100,得到结果int数字
    Function <Integer,Integer> 20 --> 120
 */
public class Demo03Function_Test {
    /*
        定义一个方法,参数传递操包括姓名和年龄的字符串.参数再传递3个Function接口用于类型转换

     */
    public static int change(String str ,
                             Function<String,String> fun1,
                             Function<String,Integer> fun2,
                             Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }

    public static void main(String[] args) {
        String string = "赵丽颖,20";
        int number = change(string,str->str.split(",")[1],str -> Integer.parseInt(str),i -> i +100);
        System.out.println(number);
    }
}
