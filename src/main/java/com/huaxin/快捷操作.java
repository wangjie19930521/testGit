package com.huaxin;

/**
 * @ClassName 快捷操作
 * @Description: TODO
 * ===================================》》》》》》》》》》》》
 * 1.5. Collections 工具类
 * Collections 工具类常用方法:
 *
 * 排序
 * 查找,替换操作
 * 同步控制(不推荐，需要线程安全的集合类型时请考虑使用 JUC 包下的并发集合)
 *
 * 1.5.1. 排序操作
 * void reverse(List list)//反转
 * void shuffle(List list)//随机排序
 * void sort(List list)//按自然排序的升序排序
 * void sort(List list, Comparator c)//定制排序，由Comparator控制排序逻辑
 * void swap(List list, int i , int j)//交换两个索引位置的元素
 * void rotate(List list, int distance)//旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为
 *
 * 1.5.2. 查找,替换操作
 * int binarySearch(List list, Object key)//对List进行二分查找，返回索引，注意List必须是有序的
 * int max(Collection coll)//根据元素的自然顺序，返回最大的元素。 类比int min(Collection coll)
 * int max(Collection coll, Comparator c)//根据定制排序，返回最大元素，排序规则由Comparatator类控制。类比int min(Collection coll, Comparator c)
 * void fill(List list, Object obj)//用指定的元素代替指定list中的所有元素。
 * int frequency(Collection c, Object o)//统计元素出现次数
 * int indexOfSubList(List list, List target)//统计target在list中第一次出现的索引，找不到则返回-1，类比int lastIndexOfSubList(List source, list target).
 * boolean replaceAll(List list, Object oldVal, Object newVal), 用新元素替换旧元素
 *
 * // toArray用法  集合转数组
 *          // 第一种方式(最常用)
 *          Integer[] integer = arrayList.toArray(new Integer[0]);
 *
 *          // 第二种方式(容易理解)
 *          Integer[] integer1 = new Integer[arrayList.size()];
 *          arrayList.toArray(integer1);
 *
 *          数组专集合：
 *          stream    Arrays.asList()
 *===================================》》》》》》》》》》》》
 *
 * @Author wanGJ1E
 * @Date 2020/8/1
 * @Version V1.0
 **/
public class 快捷操作 {

    public static void main(String[] args) {
        //String s1 = new String("计算机");//  标识常量池已经有   计算机
        String s1 = new String("计算") +new String("机");//标识常量池没有   计算机
        String s2 = s1.intern();//有  s2则是常量池的 计算机 地址   没有 （jdk1.8） s2 则是将计算机  的地址放到 常量池
        String s3 = "计算机"; //有： s1是堆中的对象地址，s2是常量池对象地址  s3是 常量池地址。   没有：s1是堆中的对象地址，s2也是堆中地址，s3从常量池拿，也是堆中地址
        System.out.println(s2);//计算机
        System.out.println(s1 == s2);//false，因为一个是堆内存中的 String 对象一个是常量池中的 String 对象，
        System.out.println(s3 == s2);//true，因为两个都是常量池中的 String 对象
    }
}
