/*
package com.huaxin.date0730;

import java.util.HashMap;
import java.util.Scanner;

*/
/**
 * @ClassName 大学同学
 * @Description: 包含多组测试用例。
 * 对于每组测试用例：
 * 第一行包括2个整数，N（1 <= N <= 1000），M(0 <= M <= N*(N-1)/2)，代表现有N个人（用1~N编号）和M组关系；
 * <p>
 * 在接下来的M行里，每行包括3个整数，a，b, c，如果c为1，则代表a跟b是同乡；如果c为0，则代表a跟b不是同乡；
 * <p>
 * 已知1表示小赛本人。
 * =====
 * 样例输入:
 * 3 1
 * 2 3 1
 * 5 4
 * 1 2 1
 * 3 4 0
 * 2 5 1
 * 3 2 1
 * 样例输出
 * 0
 * 3
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **//*

public class 大学同学 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> rset = new HashMap<>();//确认认识
            rset.put(1, 1);
            HashMap<Integer, Integer> unset = new HashMap<>();//可能认识
            if (1 <= n && n <= 1000 &&
                    0 <= m && m <= n * (n - 1) / 2) {
                for (int i = 0; i < m; i++) {
                    int one = scan.nextInt();
                    int two = scan.nextInt();
                    int three = scan.nextInt();
                    //当有关系时
                    if (three == 1) {
                        if (rset.containsKey(one) && !rset.containsKey(two)) {
                            rset.put(two, two);
                            if (unset.containsKey(two)) {
                                //如果不确定的包含two，则跟two一组的另一个也是老乡
                                int tmp = unset.remove(two);
                                unset.remove(tmp);
                                rset.put(tmp, tmp);
                            }
                        } else if (rset.containsKey(two) && !rset.containsKey(one)) {
                            rset.put(one, one);
                            if (unset.containsKey(one)) {
                                int tmp = unset.remove(one);
                                unset.remove(tmp);
                                rset.put(tmp, tmp);
                            }
                        } else if (!rset.containsKey(one) && !rset.containsKey(two)) {
                            if (!unset.containsKey(one)) unset.put(one, two);
                            if (!unset.containsKey(two)) unset.put(two, one);
                        }
                    }
                }
                System.out.println(rset.size() - 1);
            }
        }
    }
}
*/
