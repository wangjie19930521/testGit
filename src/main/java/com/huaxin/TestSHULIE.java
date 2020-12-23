package com.huaxin;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * @ClassName TestSHULIE
 * @Description: 数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 * @Author wanGJ1E
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class TestSHULIE {
    public static void main(String[] args) {
        int m;
        double sum, n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum = sum + n;
                n = Math.sqrt(n);
                //Math.pow(x,y)
                // x	必需。底数。必须是数字。
                //y	必需。幂数。必须是数字。
            }
            System.out.printf("%.2f", sum);
            System.out.println();
            // 保留两位小数，对应位上无数字填充0
            DecimalFormat df = new DecimalFormat("#0.00");
            System.out.println(df.format(42));// 42.00

            System.out.println(new BigDecimal(42).setScale(2,ROUND_HALF_UP).doubleValue());//42.0
            System.out.println(String.format("%.2f", 42.0));// 42.00
        }
    }
}
