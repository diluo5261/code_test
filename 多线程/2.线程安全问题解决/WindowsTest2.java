package day02.Test1;

class MyThread2 extends Thread{
    private static int ticket = 10000;
    private static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if (ticket > 0){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " +ticket);
                    if (ticket % 10 == 0){
                        yield();
                    }
                    ticket--;
                }else{
                    break;
                }

            }

        }
    }
}

public class WindowsTest2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();

        t1.start();
        t2.start();
        t3.start();


    }
}
