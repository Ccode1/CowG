package com.Question;

import java.util.ArrayList;
public class JosephCircle {
    public static void main(String[] args){
        System.out.println( LastRemaining_Solution(5,3));
    }
    //求最后一个幸存者
    public static int LastRemaining_Solution(int n, int m){
/*
     约瑟夫问题
     f(n,m) = (f(n-1,m)+m )% n;
     在这里我们要求的是f(n,m) ，所以我们可以从f(2,m)->f(3,m)->f(n-1,m)一直推上去
     每次迭代的res并不是每次移出的index,所以不能够求移出次序
*/
        if(n<=0 || m<=0)
            return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0;i< n;i++){
            list.add(i);
        }
        int temp = 0;
        int res = 0;
        while(!list.isEmpty()){
            temp = (temp+ m-1)% n--; //核心
            res = list.remove(temp);
        }
        return res;
    }
    //求出圈顺序
//    static void deleteResult(int n, int m){
//        ArrayList<Integer> arlist = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            arlist.add(i);
//        }
//        int k = 0;
//        while(!arlist.isEmpty()){
//            k = (k+ m -1) % n--;
//            System.out.print(arlist.remove(k) +" ");
//        }
//    }
}
