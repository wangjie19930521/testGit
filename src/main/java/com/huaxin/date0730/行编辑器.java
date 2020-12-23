package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName TestHbjq
 * @Description: 行编辑器
 * @Author wanGJ1E
 * @Date 2020/3/6
 * @Version V1.0
 **/

public class 行编辑器 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            getLine(in.nextLine().toCharArray());
        }
    }

    /**
     * 遇到#删除前一位    遇到@前面全删除   把许需要的放在最前面，@前面全删除直接将坐标为0.#删除前一位 前移一个坐标。最后截取前面的
     *
     * @param chars
     */

    static void getLine(char[] chars) {
        int writePosi = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '@') {
                writePosi = 0;
            } else if (chars[i] == '#') {
                if (writePosi != 0) {
                    writePosi--;
                }
            } else {
                chars[writePosi] = chars[i];
                writePosi++;
            }
        }
        System.out.println(String.valueOf(chars, 0, writePosi));
    }

}