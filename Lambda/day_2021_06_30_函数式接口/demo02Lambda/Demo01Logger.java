package demo02.Lambda;

//日志案例
/*
    发现以下代码存在的一些性能浪费的问题,
    调用showLog(),传递的第二个参数是一个拼接后的字符串,先把字符串拼接好,然后再调用showLog()
    showLog()方法中如果传递的等级不是1级
    那么就不会是如此拼接后的字符串
    所以字符串就白拼接了,存在浪费的问题
 */
public class Demo01Logger {
    public static void showLog(int level , String message){
        if (1== level){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String mes1 = "hello";
        String mes2 = "你好";
        String mes3 = "hi";

        showLog(1,mes1+mes2+mes3);
    }

}
