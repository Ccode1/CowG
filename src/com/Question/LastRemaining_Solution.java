package com.Question;
import org.junit.Test;

import java.util.ArrayList;
public class LastRemaining_Solution {
    //求最后一个幸存者
    public int lastRemaining_Solution(int n, int m){
/*
     约瑟夫问题
     f(n,m) = (f(n-1,m)+m )% n;
     在这里我们要求的是f(n,m) ，所以我们可以从f(2,m)->f(3,m)->f(n-1,m)一直推上去
*/
        if(n<=0 || m<=0)
            return -1;
        int res = 0;// res == f(n-1,m)
        for(int i = 1;i <= n;i++){ //
            res = (res + m) % i;
        }
        return res;
    }
    @Test
    public void test(){
        System.out.println(lastRemaining_Solution(6,3));
    }
}
