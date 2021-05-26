package string1;

import java.util.Arrays;

public class TestDemo1 {
    public static void main(String[] args) {
        byte[] b1 = {97,98,99,100};
        String str = new String(b1,1,3);
        System.out.println(str);

        byte[] b2 = str.getBytes();
        for (byte b:b2 ) {
            System.out.println(b);
        }
        //        System.out.println(Arrays.toString(b2));

    }

    public static void main3(String[] args) {
//        String str1 = "1234456";
        String str1 = "132df";

        for (int i = 0; i <str1.length() ; i++) {
            char ch = str1.charAt(i);
            if (ch <'0' || ch > '9'){
                System.out.println("not number");
                return;
            }
        }
        System.out.println("is number");

//        char [] ch1 = str1.toCharArray();
//        for (int i = 0; i < ch1.length ; i++) {
//            if(ch1[i] < '0' || ch1[i] > '9'){
//                System.out.println("not number");
//                return;
//            }
//        }
//        System.out.println("is number");
    }


    public static void main2(String[] args) {
        String str1 = "hello";
        char [] ch = {'q','w','e','r'};

        String str2 = new String(ch);
        String str3 = new String(ch,0,1);
        System.out.println(str2);
        System.out.println(str3);

        char[] ch2 = str1.toCharArray();
        for (char s:ch2 ) {
            System.out.print(s);
        }
        System.out.println();

        char ch3 = str1.charAt(2);
        System.out.println(ch3);

    }
    public static void main1(String[] args) {

        //创建数组的三种方式
        String str1 = "abcd";
        String str2 = new String("abcd");

        char[] chars = {'a','b','c','d'};
        String str3 = new String(chars);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));

        System.out.println("*********************");
        String str4 = "hello";
        String str5 = new String("hello").intern();
        System.out.println(str4 == str5);




    }

}
