package com.Argument;
public class MergeSort {
    /**
     * 归并排序的思想是：先分-->排序-->合
     * @param array
     */
    public static  void InversePairs(int[] array){
        int l =0;
        int r = array.length-1;
        divided(l,r,array);
    }

    private static void divided(int l, int r, int[] array) {
        if(l == r) return; //递归出口
        int mid = (l+r)>>1;
        divided(l,mid,array);  //根据递归思想，divided函数是将数组array先以每次递归减半的方式分成许多份，合并的时候是从数组的最左边开始
        divided(mid+1,r,array);
        meger(l,mid,r,array);
    }

    private static void meger(int l, int mid, int r, int[] array) {
        int i = l; //合并数组的左区域的开始位
        int j = mid+1;//合并数组的右区域的开始位
        int[] temp = new int[r-l+1];//定义一个辅助数组用来存放合并后的数组
        int index = 0 ; //辅助数组的索引
        while(i <= mid && j<=r){
            if(array[i]<array[j]){
                temp[index++] = array[i++];
            }else{
                temp[index++] = array[j++];
            }
        }
        while(i<=mid){
            temp[index++] = array[i++];
        }
        while (j<=r){
            temp[index++] = array[j++];
        }
        index = 0; //让辅助数组从头开始给array赋值
        for(int k = l;k<=r;k++){
            array[k] = temp[index++];
        }
    }

    public static void main(String[] args) {
        int [] nums = {9,5,2,6,4,7};
        InversePairs(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
