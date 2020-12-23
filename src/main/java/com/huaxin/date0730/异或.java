package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 异或
 * @Description: TODO
 * 给定整数m以及n个数字A1, A2, …, An，将数列A中所有元素两两异或，共能得到n(n-1)/2个结果。请求出这些结果中大于m的有多少个。
 *
 *
 *
 * 输入
 * 第一行包含两个整数n, m。
 *
 * 第二行给出n个整数A1, A2, …, An。
 *
 * 样例输入
 * 3 10
 *
 * 6 5 10
 *
 * 输出
 * 输出仅包括一行，即所求的答案。
 *
 * 样例输出
 * 2
 *
 *
 *
console.log(1+2+'a');   3a
console.log(2+'a'+1);   2a1
console.log('a'+1+2);   a12
 * @Author wanGJ1E
 * @Date 2020/7/30
 * @Version V1.0
 **/
public class 异或 {

    public static void tt(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        //for (int j = 0; j < 2; j++) {
            for (int i = 0; i < n; i++) {
                //arr[i] = scanner.nextLine();
                arr[i] = scanner.next();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        //}
    }

    public static void insert(TrieNode root, int number){
        TrieNode prev = root;
        for(int i = 31; i >= 0; i--){
            int digit = (number >> i) & 1;
            if(prev.next[digit] == null){
                prev.next[digit] = new TrieNode(digit);
            }
            prev = prev.next[digit];
            prev.count++;
        }
    }

    public static int query(TrieNode root, int a, int m, int k){
        if(root == null){
            return 0;
        }
        TrieNode prev = root;
        for(int i = k; i >= 0; i--){
            int mDigit = (m >> i) & 1;
            int aDigit = (a >> i) & 1;
            if(mDigit == 1 && aDigit == 1){
                if(prev.next[0] == null){
                    return 0;
                } else{
                    prev = prev.next[0];
                }
            } else if(mDigit == 1 && aDigit == 0){
                if(prev.next[1] == null){
                    return 0;
                } else{
                    prev = prev.next[1];
                }
            } else if(mDigit == 0 && aDigit == 0){
                return query(prev.next[0], a, m, i-1) + (prev.next[1] == null ? 0 : prev.next[1].count);
            } else if(mDigit == 0 && aDigit == 1){
                return query(prev.next[1], a, m, i-1) + (prev.next[0] == null ? 0 : prev.next[0].count);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode(-1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            insert(root, array[i]);
        }
        long result = 0;
        for(int number : array){
            result += query(root, number, m, 31);
        }
        System.out.println(result / 2);
    }

    static class TrieNode{
        TrieNode[]next = new TrieNode[2];
        int count = 0;
        int digit = 0;
        public TrieNode(int digit){
            this.digit = digit;
        }
    }
}
