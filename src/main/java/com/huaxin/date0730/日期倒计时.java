package com.huaxin.date0730;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName 日期倒计时
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 日期倒计时 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date date = df.parse(sc.nextLine());
        Date now =df.parse("2015-10-18");
        long l=date.getTime()-now.getTime();
        long day=l/(24*60*60*1000);
        System.out.println(day);
    }
}
