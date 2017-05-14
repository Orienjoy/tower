package com.orienjoy.algorithm;

import com.orienjoy.algorithm.Sort;
import org.testng.annotations.Test;

/**
 * Created by Orienjoy on 2017/5/14.
 */
public class TestSort {
    Sort sort = new Sort();

    @Test
    public void testQuickSort(){
        int a[] = {6, 1, 21, 7, 9, 35, 4, 15, 10, 8};
        sort.quickSort(a,0,a.length-1);
        sort.print("sorted: ", a);
    }

    @Test
    public void testBubbleSort(){
        int datas[] = { 5, 2, 1, 3, 6,100,0,-9,999,12 };
        sort.bubbleSort(datas);
        sort.print("sorted: ", datas);
    }

    @Test
    public void testBucketSort(){
        int a[] = {1, 3, 5, 2, 5, 8, 2, 1, 8, 3, 1, 5};
        sort.print( "排序前：", a );
        sort.bucketSort(a, 11);
        sort.print("排序后：", a);
    }
}
