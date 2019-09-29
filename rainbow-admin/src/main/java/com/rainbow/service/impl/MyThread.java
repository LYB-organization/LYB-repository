package com.rainbow.service.impl;

/**
 * 线程测试类
 * author  dengjie9527
 * date 2019/9/24
 */
public class MyThread implements Runnable{

    private int count = 5;

    @Override
    synchronized public void run() {

        count--;

        System.out.println("线程:"+Thread.currentThread().getName()+"count值="+count);
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        //谁先抢占到资源，谁先执行
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();


    }
}
