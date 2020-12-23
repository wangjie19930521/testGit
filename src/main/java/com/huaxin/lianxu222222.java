package com.huaxin;

import java.util.Scanner;

/**
 * @ClassName lianxu222222
 * @Description: 2+22+222+2222
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
public class lianxu222222 {
    public static void main(String[] args) {
        long a, b = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("输入数字a的值： ");
        a = s.nextInt();
        System.out.print("输入相加的项数：");
        int n = s.nextInt();
        int i = 0;
        while (i < n) {
            b = b + a;
            sum = sum + b;
            a = a * 10;
            ++i;
        }
        System.out.println(sum);
    }
}
