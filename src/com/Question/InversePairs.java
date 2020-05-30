package com.Question;

public class InversePairs {
    private long sum; //用来统计逆序对个数
    public int InversePairs(int [] array) {
        sum = 0;
        int l =0;
        int r = array.length -1;
        divide(l,r,array);
        return (int)sum%1000000007;
    }

    private void divide(int l, int r, int[] array) {
        if(l == r) return ;//如果待处理数组长度为1，中止递归
        int mid = (l+r)>>1; //计算出 l和r的中点位置
        divide(l,mid,array);//对左区间划分
        divide(mid+1,r,array);//对右区间划分
        merge(l,r,mid,array); //合并函数，合并左右两个子数组

    }

    private void merge(int l, int r, int mid, int[] array) {
        int i = l;//左区间的起点
        int j = mid +1;//右区间的起点
        int[] temp = new int[r-l+1]; // 创建一个临时数组保存合并子数组
        int index = 0;
        while(i<=mid && j<=r){
            if(array[i]>array[j]){
                temp[index++] = array[j++];
                sum += mid-i+1; //这一行核心代码，去统计逆序对个数,统计的基础是合并过程中两个子序列都是有序的
            }else {
                temp[index++] = array[i++];
            }
        }
      while (i<=mid){
          temp[index++] = array[i++];
      }
      while(j<=r){
          temp[index++] = array[j++];
      }
      index = 0;
      for (int k = l;k<=r;k++){
          array[k] = temp[index++];
      }
    }
}
