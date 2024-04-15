package Javapackage.Thread;
/**
 * 线程的创建有两种方法，一种是继承Thread方法，重写run方法，
 * 另一种的实现Runnable类，实现run方法，也可以实现多线程。
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        MyThread mt = new MyThread();
        t.setName("ttt1");
        System.out.println(t.getName());
        mt.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt.run=false;
        /*for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }*/
    }
}
class MyThread extends Thread{
    boolean run = true;
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("tttttt2");
        /*System.out.println(t.getName());
        Thread th = new Thread(new MyThread1());
        th.start();*/
        for (int i = 0; i < 20; i++) {
            if (run) {
                try {
                    Thread.sleep(500 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread"+i);
            }else{
                return;
            }
        }
    }
}
class MyThread1 implements Runnable{
    public void run(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        /*for (int i = 0; i < 20; i++) {
                            System.out.println("t=======>" + i);
                        }*/
                    }
                }).start();
                /*for (int i = 0; i < 20; i++) {
                    System.out.println("in the thread ====="+i);
                }*/
            }
        });
        /*t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread======="+i);
        }*/
    }
}