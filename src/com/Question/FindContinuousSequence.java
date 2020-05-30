package com.Question;

import java.util.ArrayList;

public class FindContinuousSequence {
    static ArrayList<ArrayList<Integer>> list = new ArrayList();
    public static ArrayList<ArrayList<Integer> > FindContinuousSequences(int sum){
        if(sum<=0) return list;
        for(int i = 1;i<=sum/2+1;i++){
            ArrayList<Integer> temp = new ArrayList();
            int res = 0;
            for(int j =i;j<=sum/2+1;j++){
                if(res<sum){
                    res +=j;
                    temp.add(j);
                    if(res == sum){
                        if(temp.size()>1){
                            list.add(temp);
                        }
                        break;
                    }
                }else if(res>sum){
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list2 = FindContinuousSequences(200);
        System.out.println(list2.toString() );
    }
}
