package com.huaxin.date0730;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName dddd
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/9/22
 * @Version V1.0
 **/
public class 计算器的新功能 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<Integer> list = new ArrayList<Integer>();
            Stack<Integer> stack = new Stack<>();
            int num = sc.nextInt();
            boolean flag = true;
            int temp = num;
            int length = 0;
            for (int i = 2; i <= temp; i++) {
                while (temp % i == 0) {
                    list.add(length,i);
                    length ++;
                    temp = temp /i;
                }
            }

            for(int i=1; i<=5; i++){
                for(int j=0; j<length; j++){
                    int nu = list.get(j);
                    while(nu/10 > 0){
                        //printNum(nu%10, i);
                        stack.push(nu%10);
                        nu=nu/10;
                    }
                    stack.push(nu);
                    if(j>0){
                        if(i==3)
                            System.out.print("*");
                        else {
                            System.out.print(" ");
                        }
                    }
                    while(!stack.isEmpty()){
                        printNum(stack.pop(), i);
                    }
                }
                System.out.println();
            }

        }
    }

    public static void printNum(int num, int n) {
        switch (num) {
            case 0:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("| |");
                        break;
                    case 3:
                        System.out.print("   ");
                        break;
                    case 4:
                        System.out.print("| |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 1:
                switch (n) {
                    case 1:
                        System.out.print("   ");
                        break;
                    case 2:
                        System.out.print("  |");
                        break;
                    case 3:
                        System.out.print("   ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print("   ");
                        break;
                    default:
                        break;
                }

                break;
            case 2:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("  |");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("|  ");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 3:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("  |");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 4:
                switch (n) {
                    case 1:
                        System.out.print("   ");
                        break;
                    case 2:
                        System.out.print("| |");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print("   ");
                        break;
                    default:
                        break;
                }

                break;
            case 5:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("|  ");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 6:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("|  ");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("| |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 7:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("  |");
                        break;
                    case 3:
                        System.out.print("   ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print("   ");
                        break;
                    default:
                        break;
                }

                break;
            case 8:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("| |");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("| |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            case 9:
                switch (n) {
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.print("| |");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("  |");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    default:
                        break;
                }

                break;
            default:
                break;
        }
    }
}
