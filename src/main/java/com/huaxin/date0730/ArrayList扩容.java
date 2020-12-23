package com.huaxin.date0730;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName ArrayList扩容
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/8/19
 * @Version V1.0
 **/
public class ArrayList扩容 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put(",","");
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.size());
    }
}
