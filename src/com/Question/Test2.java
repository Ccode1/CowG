package com.Question;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
public class Test2 {
    public void toFindOne(int [] nums){
       for(int i = 0;i<nums.length;i++){
           for(int j = 0;j<nums.length -i-1;j++){
               if(nums[j]>nums[j+1]){
                   swap(j,j+1,nums);
               }
           }
       }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }
    @Test
    public void test(){
        int[] nums = {1,4,7,32,7,9,234,0};
        toFindOne(nums);
        for (int x:nums){
            System.out.print(x+" ");
        }
    }
}
