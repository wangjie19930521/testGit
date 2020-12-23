package com.huaxin;

/**
 * @ClassName TestThread
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/7/14
 * @Version V1.0
 **/
public class TestThread {

    public static void main(String[] args) {

        for (int i = 0; i <20; i++) {
            Runnable runnable = () -> new Thread() {
                int i = new Number1().jia(Thread.currentThread().getName());
            }.run();
            //runnable.run();
            Thread thread = new Thread(runnable);
            thread.start();

            new Thread(()->{

            },"dsds").start();
        }
    }

}
