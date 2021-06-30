package demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    /*
        如果一个方法的返回值是一个函数式接口,那么就可以返回一个Lambda表达式
        当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取
     */
    //定义一个方法,方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法一:
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };*/

        //方法二:优化后
        //方法的返回值是一个函数式接口,那么就可以返回一个Lambda表达式
        return (o1,o2) -> o2.length() - o1.length();

    }

    public static void main(String[] args) {
        String[] str = {"faf","fsdfs","efytrege","efwfw"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str,getComparator());
        System.out.println(Arrays.toString(str));
    }
}
