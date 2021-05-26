package String2;

public class TestDemo {
    public static void main(String[] args) {
        String str1 = "abcdefghijk";
        String str2 = "abcdefghijk";
        String str3 = "ABCDE";

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//
//        System.out.println(str1.equalsIgnoreCase(str3));
//
//        System.out.println(str1.contains("cd"));
//        System.out.println(str1.contains(str3));
//        System.out.println(str1.indexOf("gh"));
//        System.out.println(str1.indexOf("gh", 2));
//        System.out.println(str1.lastIndexOf("gh"));
//        System.out.println(str1.lastIndexOf("gh", 10));

//        System.out.println(str1.startsWith("a"));
//        System.out.println(str1.startsWith("ab"));
//
//        System.out.println(str1.startsWith("def", 4));
//        System.out.println(str1.endsWith("jk"));
//        System.out.println(str1.endsWith("gh"));
//        System.out.println(str1.endsWith("ghijk"));


        String str10 = "abcdabcdabcdabcd";
        String str20 = " ";

        System.out.println(str10.replaceAll("ab", "A"));
        System.out.println(str10.replace("ab","**"));

        System.out.println(str10.replaceFirst("ab", "*"));

        String str30 = "hello world  hello china";
        String str40 = "192.168.1.1.abc.##dfs#df+f";

//        String [] str31 = str30.split(" ");
//        for (String s: str31   ) {
//            System.out.println(s);
//        }
//
//        String [] str32 = str30.split(" ",2);
//        for (String str:str32   ) {
//            System.out.println(str);
//        }

        /*String [] str41 = str40.split("\\.|#|+");
        for (String str:str41 ) {
            System.out.println(str);

        }*/

        String [] str42 = str40.split("\\.");
        for (String str_1:str42 ) {
//            System.out.println(str_1);
String [] str43 = str_1.split("#");
            for (String str_2: str43) {
                System.out.println(str_2);

            }
        }

        String str50 = "    012   345  6789   ";
        String str60 = "ABCDEFG";

        System.out.println(str50.substring(6));
        System.out.println(str50.substring(1, 5));

        System.out.println(str50.trim());
        System.out.println(str30.toUpperCase());
        System.out.println(str50.toUpperCase());

        System.out.println(str60.toLowerCase());

        System.out.println(str50.length());

        System.out.println(str50.concat(str60));


    }
}
