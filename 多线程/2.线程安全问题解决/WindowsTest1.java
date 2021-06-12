package day02.Test1;

//创建多线程的方式
//1.创建一个实现了Runable()的类
class Windows implements Runnable{
    private int ticket = 100;

    //2.重写run()方法
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}

public class WindowsTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        Windows win = new Windows();

        //4.将此对象作为参数,传递到Thread类的构造器当中
        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);

        t1.setName("窗口一:");
        t2.setName("窗口二:");
        t3.setName("窗口三:");
        //通过Thread类的对象,调用start方法
        t1.start();
        t2.start();
        t3.start();

    }
}
