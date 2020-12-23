package com.huaxin;

import java.util.concurrent.atomic.AtomicBoolean;

public class TestAtomicBoolean {

    //private static boolean initialized = false;

    private static AtomicBoolean initialized = new AtomicBoolean(false);

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                /*while (!initialized.get()) {
                    System.out.println("------------------------");
                }*/
                while (!initialized.get()) {
                    System.out.println("------------------------");
                }
            }
        }.start();
        //当前线程休息100s
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());//main
        } catch (Exception e) {
            e.printStackTrace();
        }
        //应用已经初始化
        System.out.println("==============================");
        //System.out.println(Thread.currentThread().getName());//main
        initialized.set(true);
        System.out.println(initialized);
    }
}
