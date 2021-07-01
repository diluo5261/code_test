package demo06Predicate;

/*
    逻辑表达式:可以连接多个判断条件
    && :与运算符,有false则false
    || :或运算符,有true则true
    ! : 非(取反)运算符,非真则假,非假则真

    判断资格字符串,有两个判断条件
    1.判断字符串长度是否大于5
    2.判断字符串中是否包含a
    两个条件必须同时满足,我们就可以使用&&运算符连接两个条件

    Predicate接口中有一个and,表示并且关系,也可以用于连接两个判断条件

    方法内部的两个判断条件,也是使用&&连接起来的
 */

import java.util.function.Predicate;

//
public class Demo02Predicate_and {
    /*
    定义一个方法,方法的参数,传递一个字符串
    传递两个Predicate接口:
    1.判断字符串长度是否大于5
    2.判断字符串中是否包含a
    两个条件必须同时满足
     */

    public static boolean checkString(String string , Predicate<String> pre1 , Predicate<String> pre2){
       //方法一:使用&&
//     return pre1.test(string ) && pre2.test(string);

        //方法二:
        return pre1.and(pre2).test(string);

    }

    public static void main(String[] args) {
        String str = "abcdef";
        //调用checkString方法,传递字符串和两个Lambda表达式
        boolean flag = checkString(str,string->string.length() > 5,string -> string.contains("a"));
        System.out.println(flag);
    }
}
