package com.huaxin.date0730;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName 公交车乘客
 * @Description:
 *
 * 一个公交车经过n个站点，乘客从前门上车，从后门下车。
 *
 * 现在统计了在第i个站，下车人数a[i]，以及上车人数b[i]。
 *
 * 问公交车运行时候车上最多有多少乘客
 *
 * 样例输入
 * 4
 *
 * 0 3
 *
 * 2 5
 *
 * 4 2
 *
 * 4 0
 *
 * 样例输出
 * 6
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 公交车乘客 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] num = new int[m];
        int start = 0;
        for (int k = 0; k < m; k++) {
            start = start - a[k] + b[k];
            num[k] = start;
        }
        Arrays.sort(num);
        System.out.println(num[m - 1]);
    }
}
