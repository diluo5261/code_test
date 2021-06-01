//多线程的实现方式之二:实现Runable接口
//1.创建一个类,实现Runable接口
//2.实现类去重写Runable中的方法
//3.创建类的对象
//4.创建Thread类的对象,并将实现类作为参数传递到Thread类的构造器当中
//5.通过Thread类的对象调用start方法

import java.util.ArrayList;
import java.util.List;

//1.创建一个类实现Runable接口
class MThread implements Runnable{
//2.重写抽象类中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {

        //3.创建类的对象
        MThread m2 = new MThread();

        //4.创建Thread类的对象,并将实现类的作为参数传递到Thread类的构造器当中

        Thread t2 = new Thread(m2);

        t2.setName("线程一:");
        t2.start();

    }
}


