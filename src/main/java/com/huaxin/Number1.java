package com.huaxin;

/**
 * @ClassName Number
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/7/14
 * @Version V1.0
 **/
public class Number1 {
    int count;
    public int jia(String s){
        int j = count++;
        System.out.println(s+"==========>>>"+j);
        return j;
    }
}
