package com.orienjoy.algorithm;

/**
 * Created by Orienjoy on 2017/5/11.
 */
public class Recurse {
    int recurse_sum(int m){
        if(m == 0)
            return 0;
        else
            return recurse_sum(m-1) + m;
    }

    // 与 循环 比较
    int circulate_sum(int m){
        int count = 0;
        if(m <0)
            return -1;
        for(int index = 0; index <= m; index++)
            count += index;
        return count;
    }
}

