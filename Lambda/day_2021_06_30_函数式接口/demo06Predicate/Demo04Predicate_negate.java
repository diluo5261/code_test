package demo06Predicate;

import java.util.function.Predicate;

/*
    需求:判断一个字符串长度是否大于5
    如果字符串长度大于5,那么返回false
    如果字符串长度不大于5, 返回true
    所以我们可以使用取反符号! 对结果进行取反

    Predicate接口中有一个方法negate,也表示取反
 */
public class Demo04Predicate_negate {
    public static boolean checkString(String string , Predicate<String> pre){
//      return !pre.test(string);
        return pre.negate().test(string);

    }

    public static void main(String[] args) {
        String str = "abc";
        boolean flag = checkString(str,string -> string.length() > 5);
        System.out.println(flag);
    }
}
