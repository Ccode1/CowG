package com.Argument;

public class Quack_sort {
    /**
     *快排的思想就是随机找一个数（习惯上我们将数组的第一个数当作比较对象）pivot == array[0]
     * 然后首先从尾往头遍历，寻找比pivot小的数，如果不是。right-- 找到之后将array[right] 赋值给array【left】
     * 之后从头往尾扫描，找到大于pivot的数，如果不是，left++ 找到之后将array[left] 赋值给 array[right]
     * 重复上面的操作，直到left == right  ，最后将pivot 赋值给array[left] 或者array[right] 返回相遇位置
     * 重复执行上面的步骤直至排序完成（完成标志就是quack_sort函数中的left 与 right相遇）
     */

    public static int get_mid(int[] array,int left,int right){
        int pivot = array[left];
        while(left<right){
            while(array[right]>=pivot && left<right)
                right--;
            array[left] = array[right];
            while(array[left] <= pivot && left<right)
                left++;
            array[right] = array[left];
        }
        array[left] = pivot;

        return left;
    }
    public static void quackSort(int[] array,int left,int right){
        if(left<right){
            int mid = get_mid(array,left,right);
            quackSort(array,left,mid-1);
            quackSort(array,mid+1,right);
        }

    }
    public static void main(String[] args) {
        int [] nums = {9,5,2,6,4,7};
        quackSort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
