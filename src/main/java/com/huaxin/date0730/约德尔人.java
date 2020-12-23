package com.huaxin.date0730;

import java.util.Scanner;

/**
 * @ClassName 约德尔人
 * @Description:
 * 兰博和提莫闲聊之后，回归到了他们的正题，约德尔人的未来。
 *
 * 说起约德尔人的未来，黑默丁格曾经提出了一个约德尔测试，将约德尔人的历史的每个阶段都用一个字符表达出来。(包括可写字符,不包括空格。)。然后将这个字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。相似率越高,则约德尔的未来越光明。
 *
 * 请问:相似率为多少？
 * ===================
 * 输入
 * 每组输入数据为两行，第一行为有关约德尔人历史的字符串，第二行是黑默丁格观测星空得到的字符串。
 *
 * (两个字符串的长度相等,字符串长度不小于1且不超过1000。)
 *
 * 输出
 * 输出一行，在这一行输出相似率。用百分数表示。(相似率为相同字符的个数/总个数,精确到百分号小数点后两位。printf("%%");输出一个%。)
 *
 *  * 样例输入
 *  * @!%12dgsa
 *  *
 *  * 010111100
 *
 * 样例输出
 * 66.67%
 *
 *
 * @Author wanGJ1E
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class 约德尔人 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String history = in.nextLine();
        String star = in.nextLine();
        String transHis = "";
        for (int i = 0; i < history.length(); i++) {
            char c = history.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                transHis = transHis + "1";
            } else {
                transHis = transHis + "0";
            }
        }
        int same = 0;
        for (int i = 0; i < transHis.length(); i++) {
            if (star.charAt(i) == transHis.charAt(i)) {
                same++;
            }
        }
        float out = (float) same * 100 / (float) transHis.length();
        System.out.printf("%.2f%%", out);
    }
}

