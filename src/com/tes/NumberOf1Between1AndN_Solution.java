package com.tes;

public class NumberOf1Between1AndN_Solution {
    public static int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int step = i*10; // 每次的阶梯 10 100 1000
            int k = n % step; //当前位余数
            if (k > (2*i - 1)) {
                count += (n/step)*i + i;
            } else if (k < i) {
                count +=(n/step)*i ;
            } else {
                count += (n/step)*i + k - i +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(20));
    }
}
