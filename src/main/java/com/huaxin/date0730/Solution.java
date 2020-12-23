package com.huaxin.date0730;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/8/6
 * @Version V1.0
 **/
public class Solution {

    public static ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Permutation("ab");
        System.out.println(res);
    }

    public static ArrayList<String> Permutation(String str) {
        if (str != null || str.length() > 0) {
            PermutateHelper(str.toCharArray(), 0);
            Collections.sort(res);
        }
        return res;
    }

    public static void PermutateHelper(char[] s, int i) {
        if (i == s.length - 1) {
            String val = String.valueOf(s);
            if (!res.contains(val))
                res.add(val);
        } else {
            for (int j = i; j < s.length; ++j) {
                swap(s, i, j);
                PermutateHelper(s, i + 1);
                swap(s, i, j);
            }
        }
    }

    public static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
