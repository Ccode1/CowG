package com.Argument;

import org.junit.Test;

public class HeapSort {
    public int [] heapsort(int[] nums){
        heap(nums,nums.length,0);
        return nums;
    }

    private void heap(int[] nums, int len, int i) {
        if(i>= len)
            return ;
        int max = i;
        int c1 = 2*i + 1;
        int c2 = 2*i + 2;
        if(c1 < len && nums[c1] >nums[max]){
            max = c1;
        }
        if(c2 < len && nums[c2] >nums[max]){
            max = c2;
        }
        if(max != i){
            swap(nums,i,max);
            heap(nums,len,max);
        }
    }
// 输入任意节点，然后从最后一个非叶子节点的数开始进行创建堆
    private void heap_build(int[] nums,int len){
        int parent = (len-1) >> 1;
        for(int i = parent ; i >= 0; i--){
            heap(nums,len,i);
        }
    }
    //堆排序
    private void heapSort(int[] nums,int len){
        heap_build(nums,len);
        for(int i = len-1;i>=0;i--){
            swap(nums,i,0);
            heap(nums,i,0);
        }
    }
    private void swap(int[] nums, int i, int max) {
        int temp = nums[max];
        nums[max] = nums[i];
        nums[i] = temp;
    }

    @Test
    public void test () {
        int [] nums = {4,10,3,5,1,2,100,0,89,748,2};
        heapSort(nums,nums.length);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
