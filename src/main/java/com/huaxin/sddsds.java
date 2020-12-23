package com.huaxin;

import java.util.Scanner;

/**
 * @ClassName sddsds
 * @Description:
 * 5 3 3
 * 1
 * 3
 * 5
 * 1
 * 2
 * 3
 * @Author wanGJ1E
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class sddsds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,m = 0,k = 0;
        //String input = sc.nextLine();
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            /*System.out.println(n);
            System.out.println(m);
            System.out.println(k);*/
            break;
        }
        Scanner sc1 = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i =0 ;i<m;i++){
            int num = sc1.nextInt();
            arr[num-1] = 1;
        }
        Scanner sc2 = new Scanner(System.in);
        for (int j = 0; j < k; j++) {
            int pp = sc2.nextInt();
            if(arr[pp-1]!=1){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
