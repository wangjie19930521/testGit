package com.huaxin;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName testTime
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/5/25
 * @Version V1.0
 **/
public class testTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -60);
        System.out.println(cal.getTime());
    }
}
