package com.Question;

import com.sun.org.apache.bcel.internal.generic.DCONST;

public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res =0; //因为0和任何数异或都等于其本身，所以这里res可以初始化为0
        //先得到array数组所有数异或结果，因为除了两个只出现一次的数字以外，其他数都有两个相抵消，所以最后得到结果就是所求两个数的异或结果
        for(int x:array){
            res ^= x;
        }
        int indexOne = findLastIndexOne(res); //找到前面抑或结果中从右往左第一个为1的位置。为下面分割数组提供规则
        num1[0] =0;
        num2[0] =0;
        for(int x:array){
            if(isSameArray(indexOne,x) ==0){
                num1[0] ^=x;
            }else{
                num2[0] ^=x;
            }
        }
    }
    //判断当前元素的indexOne位是否为1
    private int isSameArray(int indexOne, int x) {
        x = x >> (indexOne -1); //将当前数组元素按位从右往左移动到判断位
        return x&1;
    }
    //获得数组中全部元素异或结果从右往左数第一位为1的位数
    private int findLastIndexOne(int res) {
        int sum = 1;
        int temp = 1;
        while((res &temp )==0){
            temp = temp<<1; //从右往左依次判断res的当前位是否为1
            sum++;
        }
        return sum;
    }
}
