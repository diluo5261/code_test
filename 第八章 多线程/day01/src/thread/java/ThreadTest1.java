package thread.java;
/*
创建多线程方式之二:实现Runable接口
1.创建一个实现了Runnable接口的类
2.实现方法去实现Runnable中的抽象方法
3.创建类的对象
4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
5.通过Thread类的对象调用start()

 */

//1.创建一个实现了Runnable接口的类
class MThread implements Runnable{

    //重写抽象类中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建类的对象
        MyThread M1 = new MyThread();

        //4.创建Thread的对象,将M1作为参数传递到Thread类的构造器中

        Thread T1 = new Thread(M1);
        //5.通过Thread的对象调用start()
        T1.start();




    }

}
