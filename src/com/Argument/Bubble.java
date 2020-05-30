package com.Argument;
//冒泡排序

/**
 * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
 *
 * 在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
 *
 * @param
 */
public class Bubble {

    /**
     * 冒泡排序的思想是每一次比较相邻的两个元素，根据判断条件交换位置，小的在前，大的在后
     * 每次一层内层循环之后最大的元素都会沉到最下面，当外层循环执行完之后，所有的数字排序完成
     * @param nums
     */
    public static void sort(int[] nums) {
        int n = nums.length;
        for(int i = n-1;i>0 ;i--){
            for (int j = 0; j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
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