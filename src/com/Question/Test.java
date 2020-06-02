package com.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList();
        for(int i =0;i<numbers.length;i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list,new Comparator<Integer>(){//Comparator方法 大于0表示正序，小于0表示逆序
            @Override
            public int compare(Integer str1,Integer str2){
                String s1 = str1 +""+ str2;
                String s2 = str2+""+ str1;
                /*拿出字符串的第一个字符与参数的第一个字符进行比较，如果两者不等，比较结束，返回两者的ascii差，
                即字符串的第一个字符减去参数的第一个字符的ascii码值 返回正值说明:s2<s1 返回负值：s2>s1*/
                return s1.compareTo(s2);
            }
        });
        String minStr ="";
        for(Integer num:list)
            minStr +=num;
        return minStr;
    }
    public static void main(String[] args) {
        int[] num = {3,32,321};
        String i = PrintMinNumber(num);
        System.out.println(i);
   }
}
