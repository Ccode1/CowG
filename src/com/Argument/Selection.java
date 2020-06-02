package com.Argument;
//选择排序

/**
 * 从数组中选择最小元素，将它与数组的第一个元素交换位置。再
 * 从数组剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
 * 不断进行这样的操作，直到将整个数组排序。
 * @param
 */
public class  Selection{

    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {//外层循环控制当前排序数组结束位置
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    /**
     * 选择排序的思想是从排序数组的第一个位置开始，从剩下的元素中筛选出最小的元素放在新的第一位，
     * 然后将index移动到下一位，再从剩下的n-1个元素中挑选出最小的值，放到第二位，以此类推，得到排序数组
     * @param args
     */
    public static void main(String[] args) {
        int [] nums = {9,5,2,6,4,7};
        sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
