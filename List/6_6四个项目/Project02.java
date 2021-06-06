package arraylist;

import java.util.ArrayList;
import java.util.List;

/*
删除第一个字符当中出现的第二个字符串中的字符
例:str1 = "welcome to china"   str2 = "come";
输出结果:wl t china
 */
public class Project02 {
    public static void main(String[] args) {
        String str1 = "welcome to china";
        String str2 = "come";

        List<Character> list = new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {

            if (!str2.contains(str1.charAt(i)+"")){
                list.add(str1.charAt(i));
            }
        }

//        System.out.println(list);
        for (Character c:list ) {
            System.out.print(c);

        }
    }


}
