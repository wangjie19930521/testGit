package com.huaxin.date0730;


import java.util.Scanner;

/**
 * @ClassName 小赛的升级之路
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 小赛的升级之路 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            long n = scanner.nextInt();
            long a = scanner.nextInt();
            for(int i = 0; i < n;i++){
                long tempb = scanner.nextInt();
                if(a >= tempb){
                    a += tempb;
                }else{
                    a += gongyue(a,tempb);
                }
            }
            System.out.println(a);
        }
    }
    static long gongyue(long m,long n){
        while(m%n!=0){
            long temp = m%n;
            m = n;
            n = temp;
        }
        return n;
    }
}
