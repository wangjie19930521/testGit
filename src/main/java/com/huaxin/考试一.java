package com.huaxin;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName 考试一
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 考试一 {
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
            int count = 0;
            for (int l = sum.length - 1; l >= 0; l--) {
                count = 0;
                for (int j = 0; j < n; j++) {
                    if (sum[l] == yuwen[j] + shuxue[j] + waiyu[j]) {
                        count++;
                    }
                }
                if(count==1){
                    for (int ll = sum.length - 1; ll >= 0; ll--) {
                        for (int j = 0; j < n; j++) {
                            if (sum[ll] == yuwen[j] + shuxue[j] + waiyu[j]) {
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
    }
}
