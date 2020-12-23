package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 约会
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 约会 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            //输入
            int a=input.nextInt();
            int b=input.nextInt();
            int s=input.nextInt();
            //如何坐标为负数，需要取绝对值
            a=Math.abs(a);
            b=Math.abs(b);

            if(a+b==s){
                System.out.println("Yes");
            }else if(a+b<s){
                //多余部分走出去要能走回来
                int i=(s-(a+b))%2;
                if(i==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }
        input.close();
    }
}
