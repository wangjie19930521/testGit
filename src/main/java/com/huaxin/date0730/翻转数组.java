package com.huaxin.date0730;


import java.util.*;

/**
 * @ClassName 翻转数组
 * @Description: <p>
 * 给定一个长度为n的整数数组a，元
 * 素均不相同，问数组是否存在这样一个片段，
 * 只将该片段翻转就可以使整个数组升序排列。
 * 其中数组片段[l,r]表示序列a[l], a[l+1], ..., a[r]。
 * 原始数组为"
 * a[1], a[2], ..., a[l-2], a[l-1], a[l], a[l+1], ..., a[r-1], a[r], a[r+1], a[r+2], ..., a[n-1], a[n]，
 * 将片段[l,r]反序后的数组是
 * a[1], a[2], ..., a[l-2], a[l-1], a[r], a[r-1], ..., a[l+1], a[l], a[r+1], a[r+2], ..., a[n-1], a[n]。
 * <p>
 * 输入
 * 第一行数据是一个整数：n (1≤n≤105)，表示数组长度。
 * 第二行数据是n个整数a[1], a[2], ..., a[n] (1≤a[i]≤109)。
 * 输出
 * 输出“yes”，如果存在；否则输出“no”，不用输出引号。
 * 样例输入
 * 4
 * 2 1 3 4
 * <p>
 * 样例输出
 * yes
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 翻转数组 {

    public static void main(String[] args) {
        main3();
        //main4();
    }



    //自写正确
    public static void main3() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            if (1 <= m && m <= Math.pow(10, 5)) {
                Integer[] arr = new Integer[m];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                }
                Integer[] arr1 = Arrays.copyOf(arr, arr.length);
                Arrays.sort(arr1);
                Integer[] arr2 = Arrays.copyOf(arr, arr.length);
                int i;
                for (i = 0; i < arr.length-1; i++) {
                    if(arr[i]>arr[i+1]){
                        break;
                    }
                }
                int j;
                //2134
                for ( j= arr.length-1; j >=0 ; j--) {
                    if(arr[j]<arr[j-1]){
                        break;
                    }
                }
                Integer[] integers = Arrays.copyOfRange(arr, i, j + 1);
                for (int k = 0; k < integers.length; k++) {
                    arr2[i + k] = integers[integers.length-1-k];
                }
                if(Arrays.equals(arr1,arr2)){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }

        }
    }


    public  void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            if (1 <= m && m <= Math.pow(10, 5)) {
                Integer[] arr = new Integer[m];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                }
                boolean flag = true;
                for (int l = 0; l < arr.length; l++) {
                    if (!(1 <= arr[l] && arr[l] <= Math.pow(10, 9))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    Integer[] arr1 = Arrays.copyOf(arr, arr.length);
                    Arrays.sort(arr1);
                    Integer[] arr2 = null;
                    int count = 0;
                    a:
                    for (int i = 0; i < arr.length; i++) {
                        b:
                        for (int j = i + 1; j <= arr.length; j++) {
                            arr2 = Arrays.copyOf(arr, arr.length);
                            Integer[] ints = Arrays.copyOfRange(arr2, i, j);
                            List<Integer> integers = Arrays.asList(ints);
                            Collections.reverse(integers);
                            ints = integers.toArray(new Integer[0]);
                            for (int k = 0; k < ints.length; k++) {
                                arr2[i + k] = ints[k];
                            }
                            if (Arrays.equals(arr1, arr2)) {
                                System.out.println("yes");
                                count++;
                                break a;
                            }
                            arr2 = null;
                        }
                    }
                    if (count == 0) {
                        System.out.println("no");
                    }
                }
            }
        }
    }


    /**
     * 22       * 使用list自带的sort方法先进性排序，然后转成toString去判断两个集合是否相等
     * 23       * 方法6
     * 24
     */
    private static boolean checkDiffrent5(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        list.sort(Comparator.comparing(String::hashCode));
        list1.sort(Comparator.comparing(String::hashCode));
        return list.toString().equals(list1.toString());
    }

    //正确
    public void main4() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int len = scanner.nextInt();
            int[] array = new int[len];
            int[] copy = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = scanner.nextInt();
                copy[i] = array[i];
            }
            Arrays.sort(copy);
            //2134      array
            //1234      copy
            int left = 0, right = len - 1;
            while (left < len && copy[left] == array[left]) left++;
            while (right >= 0 && copy[right] == array[right]) right--;


            int i;
            for (i = 0; i <= right - left; i++) {
                if (copy[left + i] != array[right - i])
                    break;
            }
            if (i > right - left)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
