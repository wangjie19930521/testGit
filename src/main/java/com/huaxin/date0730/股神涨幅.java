package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 股神
 * 有股神吗？
 *
 * 有，小赛就是！
 *
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 *
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 *
 *
 *
 * 输入
 * 输入包括多组数据；
 *
 * 每行输入一个n，1<=n<=10^9 。
 *
 * 样例输入
 * 1
 *
 * 2
 *
 * 3
 *
 * 4
 *
 * 5
 *
 * 输出
 * 请输出他每股股票多少钱，对于每组数据，输出一行。
 *
 * 样例输出
 * 1
 *
 * 2
 *
 * 1
 *
 * 2
 *
 * 3
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 股神涨幅 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            int n = scanner.nextInt();
            int money = 1;
            int m = 1;
            int zf = 1; //涨幅
            while (m < n) {
                if(n == 1){
                    break;
                }
                if (flag) {
                    if (n - m >= zf) {
                        money = money + zf;
                        m = m + zf;
                        zf++;
                    } else {
                        money = money + n - m;
                        m = n ;
                    }
                    flag = false;
                } else {
                    money = money - 1;
                    flag = true;
                    m++;
                }
            }
            System.out.println(money);
        }

    }
}
