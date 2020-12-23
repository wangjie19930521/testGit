package com.huaxin.date0730;

import java.util.Stack;

/**
 * @ClassName 栈测试
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 栈测试 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
