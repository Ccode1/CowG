package com.Argument;

import org.junit.Test;

public class HeapSort {
    private void swap(int[] nums, int i, int max) { // 交换函数
        int temp = nums[max];
        nums[max] = nums[i];
        nums[i] = temp;
    }
    private void heap(int[] nums, int len, int i) { // 判断当前位置是否为正常的堆序
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
    private void heap_build(int[] nums,int len){ //创建堆
        int parent = (len-1) >> 1;
        for(int i = parent ; i >= 0; i--){
            heap(nums,len,i);
        }
    }
    //堆排序
    private void heapSort(int[] nums,int len){ //堆排序，每次将堆顶跟最后一个节点交换，让最后的一个节点最大（类似于冒泡）
        heap_build(nums,len);
        for(int i = len-1;i>=0;i--){
            swap(nums,i,0);
            heap(nums,i,0);
        }
    }

    @Test
    public void test () {
        int [] nums = {4,10,3,5,1};
        heap_build(nums,5);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
