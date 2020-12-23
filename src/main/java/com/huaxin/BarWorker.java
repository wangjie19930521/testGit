package com.huaxin;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class BarWorker implements Runnable {

    private static AtomicBoolean exists = new AtomicBoolean(false);

    //private static Boolean exists = false;

    private String name;

    public BarWorker(String name) {
        this.name = name;
    }

   /* public void run() {
        if (!exists) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            exists = true;
            System.out.println(name + " enter");
            System.out.println(name + " working");
            System.out.println(name + " leave");
            //exists.set(false);

        } else {
            System.out.println(name + " give up");
        }
    }*/

    public void run() {
        if (!exists.get()) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                // do nothing
            }
            //exists = true;
            exists.set(true);
            System.out.println(name + " enter");
            try {
                System.out.println(name + " working");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // do nothing
            }
            System.out.println(name + " leave");
            //exists = false;
        } else {
            System.out.println(name + " give up");
        }
    }
}