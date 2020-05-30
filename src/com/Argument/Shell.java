package com.Argument;
public class Shell {
    /**
     * 希尔排序： 根据数组大小先对数组进行分组 一般分组不固定，习惯上是对数组长度N>>1  然后对这N>>1组之内进行插入排序
     *           之后分组 逐渐减小 直至最后分组为1，即对部分排序后的原数组进行插入排序
     *           希尔排序对于大数量级的数组排序效率上会远远高于插入排序，数组长度越大，效率提升越明显
     * @param nums
     */
    public static void sort(int[] nums) {
        int N = nums.length;
        int h = N >> 1;
        while(h>=1){
            for(int i = h;i <N ;i++){
                for(int j = i; j>= h;j -=h){
                    if(nums[j]<nums[j-h]){
                        int temp = nums[j];
                        nums[j] = nums[j-h];
                        nums[j-h] = temp;
                    }
                }
            }
            h = h>>1;
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