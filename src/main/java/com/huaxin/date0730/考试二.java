package com.huaxin.date0730;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName 考试二
 * @Description: 输入  ab  cd     bc
 * 输出  ab cd
 * cd ab
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 考试二 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        f(arr,n,0);
    }

    //阶乘
    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    //==============================================


    public static void main2(String[] args) {
        String[] shu = {"ab","cd"};
        //String[] shu = {"ab","bc","cd"};
        f(shu,2,0);
       /*System.out.println(stack);
        stack.add("dddd");
        System.out.println(stack);
        stack.add("rrrrrr");
        System.out.println(stack);
        stack.push("jjjjj");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);*/
    }
    /**
     *
     * @param shu   待选择的数组
     * @param targ  要选择多少个次
     * @param cur   当前选择的是第几次
     */
    public static Stack<String> stack = new Stack<String>();
    private static void f(String[] shu, int targ, int cur) {
        if(cur == targ) {
            //System.out.println(stack);
            for (int i = 0; i < stack.size(); i++) {
                System.out.print(stack.get(i)+ " ");

            }
            System.out.println();
            return;
        }

        for(int i=0;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f(shu, targ, cur+1);
                stack.pop();
            }
        }
    }
}

