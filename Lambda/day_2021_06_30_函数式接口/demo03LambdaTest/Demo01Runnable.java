package demo03LambdaTest;

public class Demo01Runnable {

    //定义一个方法startThread,方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"启动");
            }
        });
        //调用startThread方法,方法的参数式一个函数式接口,所以可以传递Lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"启动"));
    }
}
