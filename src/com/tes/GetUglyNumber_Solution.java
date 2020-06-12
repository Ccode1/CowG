package com.tes;

public class GetUglyNumber_Solution {
    public static int getUglyNumber_Solution(int index){
        if(index <= 0)
            return 0;
        if(index <7)
            return index;
        int[] res = new int[index]; // 记录每次最小的丑数
        int min = 0;
        int a,b,c;
        a = b = c = 0;
        res[0] = 1;
        for(int i = 1;i<index;i++){
            min = Math.min(res[a]*2,Math.min(res[b]*3,res[c]*5));
            if(min == res[a]*2)
                a++;
            if(min == res[b]*3)
                b++;
            if(min == res[c]*5)
                c++;
            res[i] = min;
        }
        return res[index-1];
    }

    public static void main(String[] args) {
        System.out.println(getUglyNumber_Solution(7));
    }
}
