package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
/*123
        223
        323
        423
        523
        623*/
/*326
        325
        324
        323
        322
        321*/
public class 字符串倒叙 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.next();
        }
        for (int j = arr.length-1; j >=0; j--) {
            StringBuilder s = new StringBuilder(arr[j]);
            String string = s.reverse().toString();
            System.out.println(string);
        }
    }
}
