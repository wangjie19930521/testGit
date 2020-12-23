package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 考试一
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 考试一 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        m = (Integer.parseInt(m)+1)+"";
        int[] ints = new int[m.length()];
        while (true) {
            for (int i = 0; i < m.length(); i++) {
                ints[i] = Integer.parseInt(m.charAt(i) + "");
            }
            if (ints[0] + ints[1] + ints[2] == ints[3] + ints[4] + ints[5]) {
                System.out.println(m);
                break;
            } else {
                m = (Integer.parseInt(m) + 1) + "";
            }
        }
    }
}
