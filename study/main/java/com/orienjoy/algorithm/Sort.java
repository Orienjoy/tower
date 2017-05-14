package com.orienjoy.algorithm;

import java.util.Arrays;

/**
 * Created by Orienjoy on 2017/5/14.
 */
public class Sort {

    // 选择排序、计数排序、基数排序、插入排序、归并排序和堆排序
    // 堆排序 —— 基于二叉树的排序

    // 平均时间复杂度 O(NlogN)，最坏时O(N2)
    public static void quickSort(int[] a, int left, int right) {
        if(left>right) return;
        int base = a[left]; // base存放基准数
        int i = left, j = right;
        int temp;
        while (i != j) {
            // 先从右边开始找
            while (a[j] >= base && i<j) j--;
            // 再从左边找
            while (a[i] <= base && i<j) i++;
            // 交换两个数在数组中的位置
            if (i<j) { temp=a[i]; a[i]=a[j]; a[j]=temp; }
        }
        // 将基准数归位
        a[left] = a[i];  a[i] = base;
        // 递归
        quickSort(a, left, i-1); // 处理左边的
        quickSort(a, i+1, right); // 处理右边的
    }


    // O(N2) 算法复杂度高
    public static void  bubbleSort(int datas[]) {
        // 外层，控制查找第i层的数，在余下的数据里最小或最大的
        for (int i = 0; i < datas.length; i++) {
            // 内层，依次比较下标相邻的两个数的大小，并将小数或大数的位置替换
            for (int j = i + 1; j < datas.length; j++) {
                int temp = 0;
                if(datas[i] > datas[j])
                { temp = datas[j]; datas[j] = datas[i]; datas[i] = temp; }
            }
        }
    }

    /**
     *
     * @param a 待排序数组
     * @param max 数组a中最大值的范围
     * 浪费空间；不能排小数、负数
     */
    // O(M+N)  M 桶大小，N 最大重复数的个数
    public static void  bucketSort(int[] a, int max){
        int buckets[], i, j;
        if(a == null || max <1 ){
            return;
        }

        // 个数为max的桶，并初始化为0
        buckets = new int[max];
        print("ING 初始化: ", buckets);

        // 计数
        for (i=0; i<a.length; i++){
            buckets[a[i]]++;
        }
        print("ING 计数: ", buckets);

        // a[0]…a[max] 依次排序
        for(i=0,j=0;i<max;i++){
            boolean flag = false;
            if(buckets[i]  > 0){ flag = true; }

            while((buckets[i]--)>0){
                a[j++]=i;
            }

            if(flag == true) {
                // 调用Arrays.copyOfRange
                // print("ING 排序：", Arrays.copyOfRange(a,0,j) );
                printSub("ING 排序：", a, 0, j);
            }
        }
        buckets=null;
    }

    public static void print(String info, int a[]){
        System.out.print(info);
        for (int aa : a) {
            System.out.print(aa + " ");
        }
        System.out.println();
    }

    public static void  printSub(String info, int a[], int from, int to){
        System.out.print(info);
        int len = to - from;
        if (len >= 0){
            for (int i=0; i<len; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
