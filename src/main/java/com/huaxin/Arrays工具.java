package com.huaxin;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Arrays工具
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class Arrays工具 {

   /* @Autowired
    RedissonClient redissonClient;
    @ApiOperation(value = "ttttt")
    @GetMapping("/tt")
    public void tt() throws InterruptedException {
        RLock lock = redissonClient.getLock("lock");
        lock.lock();
        Thread.sleep(Integer.MAX_VALUE);
    }*/

    public static void main(String[] args) {
        String s = "abcd.hh";
        int i = s.indexOf("a");
        int j = s.lastIndexOf(".");
        System.out.println(i);
        System.out.println(j);//4
        System.out.println(s.substring(1,3));//bc
        System.out.println(s.substring(1));//bcd.hh
        System.out.println(s.substring(j));

        int[] c = { 1, 3, 2, 7, 6, 5, 4, 9 };
        // parallelSort(int[] a) 按照数字顺序排列指定的数组(并行的)。同sort方法一样也有按范围的排序
        Arrays.parallelSort(c);
        System.out.println("Arrays.parallelSort(c)：");
        for (int x : c) {
            System.out.print(x);//12345679
        }
        System.out.println();
        System.out.println(Arrays.toString(c));//[1, 2, 3, 4, 5, 6, 7, 9]
        Arrays.fill(c, 3);
        System.out.println(Arrays.toString(c));//[3, 3, 3, 3, 3, 3, 3, 3]
        System.out.println("======================");
        char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        char[] f = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        /*
         * 元素数量相同，并且相同位置的元素相同。 另外，如果两个数组引用都是null，则它们被认为是相等的 。
         */
        // 输出true
        System.out.println("Arrays.equals(e, f):" + Arrays.equals(e, f));
        System.out.println("====================================================");
        // *************复制 copy****************
        // copyOf 方法实现数组复制,h为数组，6为复制的长度
        int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
        int[] n = Arrays.copyOf(h, 6);
        System.out.println("Arrays.copyOf(h, 6);：");
        // 输出结果：123333
        System.out.println(Arrays.toString(n));

        // copyOfRange将指定数组的指定范围复制到新数组中
        int[] m = Arrays.copyOfRange(h, 6, 11);
        System.out.println("Arrays.copyOfRange(h, 6, 11)：");
        // 输出结果66600(h数组只有9个元素这里是从索引6到索引11复制所以不足的就为0)
        System.out.println(Arrays.toString(m));

        System.out.println("===================如何反转数组=================================");
        String[] sss= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(sss);
        Collections.reverse(list);
        sss=list.toArray(new String[0]);//没有指定类型的话会报错
    }
}
