package com.Question;

import org.junit.Test;

public class Sum_Solution {
    public int sum_Solution(int n){
        int sum = n;
        boolean ans = (n>0) && (sum += sum_Solution(n-1))>0;
        return  sum;
    }
    @Test
    public void test(){
        System.out.println(sum_Solution(10));
    }
}
