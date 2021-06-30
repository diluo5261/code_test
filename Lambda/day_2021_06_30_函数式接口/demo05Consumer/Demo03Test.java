package demo05.Consumer;
/*
练习:字符串数组当中存有多条信息,请按照格式"姓名 : xx , 性别:xx ."格式打印出来
要求打印姓名的动作作为第一个Consumer接口的Lambda实例,
将打印性别作为第二个Consumer接口的Lambda实例
将两个Consumer接口按照顺序拼接到一起
 */

import java.util.function.Consumer;

public class Demo03Test {
    //定义一个方法,参数传递String类型的数组和两个Consumer接口,泛型使用String
    public static void printInfo(String [] array, Consumer<String> con1 , Consumer<String> con2){
        for (String message : array) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String [] array ={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        printInfo(array,
                message -> {
            //消费方式:对message数组进行切割,获取姓名,按照指定格式进行输出
                    String name = message.split(",")[0];
                    System.out.print("姓名 : " + name +" , ");
                }, message ->{

            //消费方式:对message字符串进行切割,获取年龄,按照指定格式输出
                    String gender = message.split(",")[1];
                    System.out.println("性别 : " + gender + ".");
        });
    }
}
