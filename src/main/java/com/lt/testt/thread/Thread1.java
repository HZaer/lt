package com.lt.testt.thread;

public class Thread1 implements Runnable {
     static Object o = new Object();
    public void run() {
        synchronized(o) { //请问这里的this怎样理解，t1和t2的地址不是不一样嘛，怎么会只有一个线程运行？？？
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t2, "B");
        ta.start();
        tb.start();
    }
}