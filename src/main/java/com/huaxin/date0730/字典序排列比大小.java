package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 比大小
 * @Description: TODO
 * 现在有"abcdefghijkl”12个字符，
 * 将其所有的排列中按字典序排列，给出任意一种排列，
 * 说出这个排列在所有的排列中是第几小的？
 * <p>
 * <p>
 * 样例输入
 * 3
 * <p>
 * abcdefghijkl
 * <p>
 * hgebkflacdji
 * <p>
 * gfkedhjblcia
 * <p>
 * <p>
 * 样例输出
 * 1
 * <p>
 * 302715242
 * <p>
 * 260726926
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 字典序排列比大小 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            char[] ch = str.toCharArray();
            System.out.println(f(ch));
        }
        s.close();
    }

    static int f(char[] ch) {
        int rank = 1;
        for (int i = 0; i < ch.length; i++) {
            rank += (ch[i] - 'a') * f2(ch.length - i);
            for (int j = i; j < ch.length; j++) {
                if (ch[j] > ch[i]) {
                    ch[j]--;
                }
            }
        }
        return rank;
    }

    static int f2(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
