package com.Argument;
//插入排序

/**
 * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
 *
 * 对于数组 {3, 5, 2, 4, 1}，它具有以下逆序：(3, 2), (3, 1), (5, 2), (5, 4), (5, 1), (2, 1), (4, 1)，插入排序每次只能交换相邻元素，令逆序数量减少 1，因此插入排序需要交换的次数为逆序数量。
 *
 * 插入排序的时间复杂度取决于数组的初始顺序，如果数组已经部分有序了，那么逆序较少，需要的交换次数也就较少，时间复杂度较低。
 *
 * 平均情况下插入排序需要 ~N2/4 比较以及 ~N2/4 次交换；
 * 最坏的情况下需要 ~N2/2 比较以及 ~N2/2 次交换，最坏的情况是数组是倒序的；
 * 最好的情况下需要 N-1 次比较和 0 次交换，最好的情况就是数组已经有序了。
 * @param
 */
public class Insertion {
    public static void sort(int[] nums) {
       for(int i = 1;i<nums.length;i++){ // 外层循环控制开始比较位置，以及外层循环的i值为重新排序数组的右边界
           for(int j = i;j>0;j--){ //内层循环每次都会重新回到新的排序数组中更新排序顺序
               if(nums[j]<nums[j-1]){
                   int temp = nums[j];
                   nums[j] = nums[j-1];
                   nums[j-1] = temp;
               }
           }
       }
    }
    public static void main(String[] args) {
        int [] nums = {9,5,2,6,4,7};
        sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}