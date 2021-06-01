
//1.创建一个继承于Thread的子类
//2.重写子类中的run方法
//3.船舰子类的对象
//4.通过子类对象调用父类中的start()方法,有两个作用1.启动当前进程,2.调用当前进程的run方法

//1.创建一个继承于Thread 的子类
class MyThread extends Thread{

    //2.重写父类中的run方法


    public MyThread(String name) {
        super(name);
    }

    //2.重写run方法
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(getName()+":"+i);
            }

        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //3.创建子类对象
        MyThread m1 = new MyThread("进程一:");
        //4.通过对象调用start方法,1.启动当前对象2.调用当前线程的run方法
        m1.start();

        Thread.currentThread().setName("主线程:");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    }
}
