package com.Question;

public class ReverseSentence {
    public static String ReverseSentence(String str) {
        if(str.equals(" ")){
            return str;
        }
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = strArr.length-1;i>-1;i--){
            sb.append(strArr[i]);
            sb.append(" ");

        }
        return sb.substring(0,str.length());
    }

    public static void main(String[] args) {
        String str = "I am a student. you bad gay";
        System.out.println(ReverseSentence(str));
    }
}
