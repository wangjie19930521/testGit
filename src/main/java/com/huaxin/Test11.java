package com.huaxin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName Test11
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
public class Test11 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                v1 v1 = new v1();
                v1.caozuo();
                System.out.println(v1.a);
                ArrayList<Object> objects = new ArrayList<>();
                objects.add("dsd");
            },i+"").start();
        }
    }
    //////////////////
    static class v1{
        private int a;

        public void caozuo(){
            a++;
        }
    }
}
