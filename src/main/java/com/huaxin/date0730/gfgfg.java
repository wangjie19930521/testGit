package com.huaxin.date0730;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName gfgfg
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class gfgfg {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] minzi = new String[n];
        int[] yuwen = new int[n];
        int[] shuxue = new int[n];
        int[] waiyu = new int[n];
        if (n < 40) {
            for (int i = 0; i < n; i++) {
                minzi[i] = scan.next();
                yuwen[i] = scan.nextInt();
                shuxue[i] = scan.nextInt();
                waiyu[i] = scan.nextInt();
            }
            int[] sum = new int[n];
            for (int j = 0; j < n; j++) {
                sum[j] = yuwen[j] + shuxue[j] + waiyu[j];
            }
            Arrays.sort(sum);

            int[] index = new int[n];
            for (int l = sum.length - 1; l >= 0; l--) {
                for (int j = 0; j < n; j++) {
                    if (sum[l] == yuwen[j] + shuxue[j] + waiyu[j]) {
                        index[j] = j;
                        System.out.println(minzi[j]);
                        System.out.println(yuwen[j]);
                        System.out.println(shuxue[j]);
                        System.out.println(waiyu[j]);
                    }
                }
            }
        }
    }
}
