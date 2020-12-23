package com.huaxin;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author wanGJ1E
 * @Date 2020/3/7
 * @Version V1.0
 **/
public class Main {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        double n = Double.valueOf(arr[0]);
        double m = Double.valueOf(arr[1]);
        double sum = n;
        for(int i=1;i<m;i++){
            double z = Math.sqrt(n);
            sum = sum+z;
            n = z;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(sum));
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int n = Integer.valueOf(arr[0]);
        int m = Integer.valueOf(arr[1]);
        int count = 0;
        for (int i = n;i<=m;i++){
            String q = i+"";
            int sum = 0;
            for (int p =0;p<q.length();p++){
                int i1 = Integer.parseInt(String.valueOf(q.charAt(p)));
                sum = sum + i1*i1*i1;
            }
            if(i == sum){
                System.out.println(i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("no");
        }
    }
}
