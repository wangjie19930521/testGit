package com.huaxin.date0730;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName 难度系数
 * @Description: 根据难度系数出题
 * @Author wanGJ1E
 * @Date 2020/7/30
 * @Version V1.0
 **/
public class 出考试题难度系数 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);*/
        System.out.println(solve());
    }

    public static int solve() {
        int n = scan.nextInt();
        if (n == 0) {
            return 3;
        }
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int res = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (tmp == 0) {
                tmp = 2;
                continue;
            }
            //连续的3个数，没有满足条件 差几个就需出题几个。
            //如果一个数连续的都没有，最少就要再出两个
            if (array[i] - array[i - 1] <= 10) {
                tmp--;
            } else {
                res += tmp;
                tmp = 2;
            }
        }
        res += tmp;

        return res;
    }
}
