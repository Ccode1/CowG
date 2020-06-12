package com.Question;
import java.util.ArrayList;
public class ReverseSentence2 {
    public static String ReverseSentence(String str) {
        str = str.trim();
        if(str.length() == 0)
            return str;
        if(str.equals(" ")){
            return str;
        }
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = strArr.length -1;i > 0;i--){
            sb.append(strArr[i]).append(" ");
        }
        return sb.append(strArr[0]).toString();
    }

    public static void main(String[] args) {
        String str = "I am a student.      ";

        System.out.print(ReverseSentence(str));

    }
}