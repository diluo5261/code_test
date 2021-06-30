package demo04.Supplier;

import java.util.function.Supplier;

/*
    练习:求数组的最大值
    使用Supple接口作为方法参数类型,提供Lambda表达式求出int数组中的最大值
    提示:接口泛型使用Integer
 */
public class Demo02Test {
    //定义一个方法,用于获取int类型数组中元素的最大值,方法的参数传递Supplier接口,泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,4,99};

       int maxValue = getMax(()->{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println("maxValue is :" + maxValue);
    }
}
