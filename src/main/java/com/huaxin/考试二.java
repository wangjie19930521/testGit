package com.huaxin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @ClassName 考试一
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 考试二 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<stu> stus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stu stu = new stu(scan.next(),n,scan.nextInt(),scan.nextInt(),scan.nextInt());
            stus.add(stu);
        }
        Collections.sort(stus);
        for (int i = stus.size()-1; i >=0; i--) {
            stu stu = stus.get(i);
            System.out.println(stu.name);
            System.out.println(stu.yuwen);
            System.out.println(stu.shuxue);
            System.out.println(stu.waiyu);
        }
    }

    static class stu implements Comparable<stu> {

        String name;

        int index;

        int yuwen;

        int shuxue;

        int waiyu;

        public stu(String name,int index,int yuwen,int shuxue,int waiyu){
            this.name = name;
            this.index = index;
            this.yuwen = yuwen;
            this.shuxue = shuxue;
            this.waiyu = waiyu;
        }
        @Override
        public int compareTo(stu o) {
            if(this.yuwen+this.shuxue+this.waiyu>o.yuwen+o.shuxue+o.waiyu){
                return 1;
            }else if(this.yuwen+this.shuxue+this.waiyu==o.yuwen+o.shuxue+o.waiyu){
                if(this.yuwen>o.yuwen){
                    return 1;
                }else if(this.yuwen==o.yuwen){
                    if(this.shuxue >o.shuxue){
                        return 1;
                    }else if(this.shuxue == o.shuxue){
                        if(this.index<o.index){
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
    }
}
