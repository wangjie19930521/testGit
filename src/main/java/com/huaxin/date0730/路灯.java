package com.huaxin.date0730;

import java.util.*;

/**
 * @ClassName 路灯
 * @Description: TODO
 * V先生有一天工作到很晚，回家的时候要穿过一条长l的笔直的街道，这条街道上有n个路灯。
 * 假设这条街起点为0，终点为l，第i个路灯坐标为ai。路灯发光能力以正数d来衡量，
 * 其中d表示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。
 * 为了让V先生看清回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
 *
 *
 * 输入
 * 输入两行数据，第一行是两个整数：路灯数目n (1≤n≤1000)，
 * 街道长度l (1 ≤l≤109)。第二行有n个整数ai (0 ≤ ai≤ l)，表示路灯坐标，
 * 多个路灯可以在同一个点，也可以安放在终点位置。
 *
 * 输出
 * 输出能够照亮整个街道的最小d，保留两位小数。
 *
 * 样例输入
 * 7 15
 *
 * 15 5 3 7 9 14 0
 *
 * 样例输出
 * 2.50
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 路灯 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            double l = scanner.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            if(l>=1 && l<= 109 && n >=1 && n<= 1000){
                List<Double> objects = new ArrayList<>();
                Arrays.sort(arr);
                for (int j = 1; j < arr.length; j++) {
                    double num= arr[j]-arr[j-1];
                    objects.add(num);
                }
                double ks = arr[0] - 0;
                double js = l -arr[arr.length-1];
                objects.add(ks);
                objects.add(js);
                Collections.sort(objects);
                Double max = objects.get(objects.size() - 1);
                System.out.printf("%.2f",max/2);
            }
        }
    }

    //正确  修改
    public void main1(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[] spot = new int[n];
        for(int i=0;i<n;i++)
            spot[i] = sc.nextInt();
        Arrays.sort(spot);
        double maxdistance = Double.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(spot[i]-spot[i-1]>maxdistance)
                maxdistance = spot[i]-spot[i-1];
        }
        double left = spot[0];
        double right = len - spot[n-1];
        if(left>right&&left>maxdistance/2){
            System.out.printf("%.2f",left);
        }
        else if(right>=left&&right>maxdistance/2){
            System.out.printf("%.2f",right);
        }
        else{
            System.out.printf("%.2f",maxdistance/2);
        }
    }
}
