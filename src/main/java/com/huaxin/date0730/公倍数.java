package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 公倍数
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 公倍数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * b;
        if (a < b) {
            int r = 0;
            r = a;
            a = b;
            b = r;
        }
        while (true) {
            int r = a % b;
            if (r == 0) {
                System.out.println("最小公倍数：" + c / b);
                break;
            } else {
                a = b;
                b = r;
            }
        }
    }
}
