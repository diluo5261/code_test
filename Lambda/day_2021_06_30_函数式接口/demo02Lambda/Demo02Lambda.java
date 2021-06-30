package demo02.Lambda;
/*
    使用Lambda表达式优化日志案例
    Lambda的特点:延迟加载
    Lambda的使用前提,必须存在函数式接口
 */

public class Demo02Lambda {
    //定义一个显示日志的方法,方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level,MessageBuilder mb){
        if (1 == level){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String mes1 = "hello";
        String mes2 = "你好";
        String mes3 = "hi";

        //调用showLog(),参数MessageBuilder是一个函数式接口,所以可以传递Lambda表达式
        showLog(1,()->mes1+mes2+mes3);
        /*
        使用Lambda表达式作为参数传递,仅仅是把参数传递到showLog方法中
        只有满足条件,日志的等级是1级
            才会调用接口MessageBuilder中的方法builderMessage
            才会进行字符串的拼接
         如不满足条件:
            MessageBuilder中的方法builderMessage也不会执行
            使用拼接字符串的代码也不会执行
          所以不会存在性能浪费

         */
    }
}
