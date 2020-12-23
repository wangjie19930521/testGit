package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 基本输入
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 基本输入 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Object[] arr = new Object[n];
        for (int i = 0; i < n; i++) {
            //arr[i]=scan.nextInt();
            arr[i]=scan.next();
            System.out.println(arr[i]);
        }
    }
}
