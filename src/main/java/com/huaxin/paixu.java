package com.huaxin;

import java.util.Scanner;

/**
 * @ClassName paixu
 * @Description: 排序
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
public class paixu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("请输入10个整数：");
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
