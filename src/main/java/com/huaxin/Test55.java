package com.huaxin;

import java.util.Scanner;

/**
 * @ClassName Test55
 * @Description: BABABABABABABABA
 * @Author wanGJ1E
 * @Date 2020/3/8
 * @Version V1.0
 **/
/*ABABABABABABABAB
        BABABABABABABABA
        AAAABBBAAAABBBAA
        AABBAABBAABBAABB
        BAAABAAABAABAABA
        ABAABAABAABAABAA
        BAAABBAAABBAABBA
        AABBAABBAABBAABB
        AAABAAABAAABAAAB*/
/*0
        0
        11
        5
        8
        6
        5
        8
        8
        8*/
public class Test55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String a = "sdsd";
        //int i1 = a.hashCode();
        String[] arr = new String[num];
        Scanner in1 = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            arr[i] = in1.nextLine();
        }
        //System.out.println(arr[0]+"--"+arr[1]);
        for (int i = 0; i <arr.length; i++) {
            int count = 0;
            for(int j = 0; j <arr[i].length()-1;j++){
                if(arr[i].charAt(j)==arr[i].charAt(j+1)){
                    count = count+1;
                }
            }
            System.out.println(count);
        }
    }
}