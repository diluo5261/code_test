package thread.java;

/*
测试Thread中的常用方法
1.start（）：启动当前线程，调用当前线程的run（）
2.run（）：通常需要重写Thread类中此方法，将创建的线程要执行的操作声明在此方法中
3.currentThread（）：静态方法，返回执行当前代码的线程
4.getName（）：获取当前线程的名字
5.setName():设置当前线程的名字
6.yield():释放当前CPU的执行权
7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态,直到线程b完全执行完以后,线程a才
          结束阻塞状态:
8.stop():已过时.当执行此方法时,强制结束当前线程
9.sleep(long millitime):让当前线程"睡眠"指定的millitime毫秒.在指定的millitime毫秒内,
                        当前线程是阻塞状态.
10.islive():判断当前线程是否存活

线程的优先级:
1.
  MAX_PRIORITY:10;
  MIN_PRIORITY:1
  NORM_PRIORITY:5  -->默认优先级

 2.如何获取和设置当前线程的优先级:
    getPriority():获取线程的优先级
    setPriority(int p): 设置线程的优先级

   说明:高优先级的线程要抢占低优先级线程cpu的执行权.但是只是从概率上讲,
        高有先的线程高概率的情况下被执行.并不意味着只有当高优先级的线程被执行完以后,
        低优先级的线程才被执行



 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//1.创建一个继承于Thread的子类
class HelloThread extends Thread{

    public HelloThread(String name){
        super(name);
    }

    //2.重写父类中run方法
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if (i > 50) {
                yield();
            }
            if (i % 2 == 0 ){
            System.out.println(getName() + ":" + i +"优先级:"+ getPriority());
            }
        }
    }
}


public class ThreadMethodTest {
    public static void main(String[] args) {
        //3.创建一个Thread子类对象
        HelloThread h1 = new HelloThread("线程二:");
//        h1.setName("线程一:");

        //4.通过对象调用start方法
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();


        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i == 50){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i+ "优先级"+Thread.currentThread().getPriority());
            }
        }
        System.out.println(h1.isAlive());
    }
}
