package demo06Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习:集合信息筛选
    数组当中有多条姓名 + 性别 的信息:
    String [] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
    请通过Predicate接口的拼装将符号要求的字符串筛选到集合ArrayList当中
    需要同时满足两个条件:
    1.必须为女生
    2.姓名为4个字

    分析:
        1.必须有两个判断条件,使用两个Predicate接口,对条件进行判断
        2.必须同时满足两个条件,所以可以用and方法连接两个判断条件
 */
public class Demo05Test {
    /*
    定义一个方法:
    方法的参数传递一个包含人员信息的数组
    传递两个Predicate接口,用于对数组中的信息进行过滤
    把满足条件的信息存储到ArrayList集合中并返回
     */

    public static ArrayList<String> filter(String [] array, Predicate<String> pre1 , Predicate<String> pre2 ){
        ArrayList<String> list = new ArrayList<>();
        for (String str: array) {
            if (pre1.and(pre2).test(str)) {
                list.add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String [] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        ArrayList<String> list = filter(arr,
                                str ->str.split(",")[1].equals("女")//判断性别是否为女
                                ,str -> str.split(",")[0].length() == 4);//判断字符串长度是否为4
       //遍历集合
        for (String str: list) {
            System.out.println(str);
        }
    }
}
