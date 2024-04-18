package Javapackage.Thread;

import java.util.concurrent.*;

/**
 * 线程的创建有几种方法，一种是继承Thread方法，重写run方法，
 * 另一种的实现Runnable类，实现run方法，也可以实现多线程。
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        /*Thread t = Thread.currentThread();
        MyThread mt = new MyThread();
        t.setName("ttt1");
        System.out.println(t.getName());
        mt.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt.run=false;*/
        /*for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }*/
        /*MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();*/
        /*

        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();

        t2.start();

        t3.start();
*/
        /*Callable call = new MyThread2();
        FutureTask<Integer> task = new FutureTask<>(call);
        Thread t = new Thread(task);
        t.start();
        try {
            Integer i = task.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
        Callable call = new MyThread2();
        FutureTask<Integer> task = new FutureTask<>(call);
        Runnable ra = new MyThread3();
        Thread td = new MyThread4();
        Runnable ra1 = new MyThread3();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(task);
        executorService.submit(ra);
        executorService.submit(td);
        executorService.submit(ra1);
        try {
            Integer i = task.get();
            System.out.println("Callable:"+i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"===》" + i);
        }
    }
}
class MyThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"===>" + i);
        }
    }
}


class MyThread2 implements Callable {
    @Override
    public Integer call() throws Exception {
        return 1;
    }
}
class MyThread implements Runnable{
    boolean run = true;
    private int j = 0;
    private int i = 0;
    char[] English = {'A','B','C'};
    @Override
    public void run() {
        while (run) {
            synchronized (this){
                this.notify();
                if (j == 30)break;
                if(i==3) i =0;
                System.out.println(Thread.currentThread().getName()+"====>"+ English[i++]);
                j++;
            }
        }

        /*while (true) {
            synchronized (this) {
                if(j>=100)break;
                this.notify();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "===>" + (++j));
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }*/


        /*synchronized (this) {

        }*/
        /*for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + (++j));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/


        /*Thread t = Thread.currentThread();
        t.setName("tttttt2");*/
        /*System.out.println(t.getName());
        Thread th = new Thread(new MyThread1());
        th.start();*/
        /*for (int i = 0; i < 20; i++) {
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
        }*/
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