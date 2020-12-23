package com.huaxin;

public class TestStart {

    public static void main(String[] args) {
        BarWorker bar1 = new BarWorker("bar1");
        BarWorker bar2 = new BarWorker("bar2");
        Thread thread1 = new Thread(bar1);
        thread1.setName("bar1");
        Thread thread2 = new Thread(bar2);
        thread1.setName("bar2");
        thread1.start();
        thread2.start();

    }
}
