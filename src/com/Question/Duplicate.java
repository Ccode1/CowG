package com.Question;

import java.util.HashMap;

public class Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer,Integer> map = new HashMap();
        int index = 0;
        if(numbers.length ==0 || length <=0 ||numbers.length != length)
            return false;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]<0 || numbers[i]>length-1){
                return false;
            }
            else if(numbers[i]>=0 && numbers[i]<=length-1){
                if(map.containsKey(numbers[i])){
                    map.put(numbers[i],map.get(numbers[i])+1);
                    if(map.get(numbers[i]) ==2){
                        duplication[index] = numbers[i];
                        index++;
                    }
                }else{
                    map.put(numbers[i],1);
                }
            }
        }
        for(int i:duplication){
            System.out.println(i);
        }
        if(duplication.length == 0)
            return false;
        return (duplication[0]>=0 && duplication[0]<=length-1)?true:false;
    }

    public static void main(String[] args) {
        int [] num = {2,4,2,1,4};

        System.out.println( duplicate(num,5,new int[5]));
     }
}
