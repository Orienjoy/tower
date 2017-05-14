package com.orienjoy.algorithm;

import org.testng.annotations.Test;

/**
 * Created by Orienjoy on 2017/5/11.
 */
public class TestRecurse {
    @Test
    public void testRecurse(){
        Recurse r = new Recurse();
        System.out.println( r.recurse_sum(10) );

        System.out.println( r.circulate_sum(10));
    }

}
