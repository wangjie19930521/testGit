package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 数列
 * @Description: 正确
 * @Author wanGJ1E
 * @Date 2020/8/4
 * @Version V1.0
 **/
public class 数列求和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double m = scanner.nextDouble();
            int n = scanner.nextInt();
            Double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum = sum + m;
                m = Math.sqrt(m);
            }
            System.out.printf("%.2f", sum);
        }
    }
}
