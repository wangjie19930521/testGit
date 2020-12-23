package com.huaxin;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/**
 * @ClassName 完数
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
public class 完数 {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        System.out.println("1到1000的完数有： ");
        for (int i = 1; i < 1000; i++) {
            int t = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    //所有因数相加
                    t = t + j;
                }
            }
            if (t == i) {
                System.out.print(i + "     ");
            }
        }
    }

}
