package com.huaxin;

import java.util.Scanner;

/**
 * @ClassName Test13
 * @Description: ab bc cd   2<=n<=9 .l<=s[i]<=10 .s[i]仅包含小写英文字母
 * @Author wanGJ1E
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        Scanner in1 = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            arr[i] = in1.nextLine();
        }
        String out = null;
        for (int j = 0; j < 2 * num; j++) {
            for (int m =0; m < arr.length; m++){
                if(m == arr.length -1){
                    out =out + arr[m];
                }else{
                    out =out + arr[m] + "";
                }
            }
        }
    }
}
