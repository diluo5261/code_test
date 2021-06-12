package day02.Test1;

class MyThread3 implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();

        }

    }

    private synchronized void show(){
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName()+": " + ticket);
            ticket--;
        }
    }
}

public class WindowsTest3{
    public static void main(String[] args) {
        MyThread3 thread3 = new MyThread3();

        Thread t1 = new Thread(thread3);
        Thread t2 = new Thread(thread3);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();
    }
}
