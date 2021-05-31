package thread.java;

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{

    //2.重写父类中的run方法
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(getName()+i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread子类的对象
        MyThread t1 = new MyThread();
        //4.通过对象调用start()方法:1.启动当前进程2.调用当前线程的run
        t1.start();

        //问题一:不能通过直接调用run()的方式启动线程
//        t1.run();
        //问题二：再启动一个线程，遍历100以内的偶数。不可以让已经start（）的线程去执行。会报IllegalThreadStateException
//        t1.start();
        //如果需要再次执行，就需要重写创建一个对象

//        MyThread t2 = new MyThread();
//        t2.start();

        //下面操作是再main中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+i);
            }

        }

    }
}

