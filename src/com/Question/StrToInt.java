package com.Question;

public class StrToInt {
    public static int StrToInt(String str) {
        if(str.length() == 0)
            return 0;
        String strr = str.trim();
        char[] arr = strr.toCharArray();
        long s = 0;
        if((arr[0]>='0'&& arr[0]<='9')||arr[0] == '+' ||arr[0] == '-')
        {
            if(arr[0] == '0'){
                return 0;
            }else if(arr[0] == '+' || arr[0] =='-'){
                if(arr.length ==1)
                    return 0;
                for(int i =1;i<arr.length;i++){
                    if(arr[i]<'1' ||arr[i]>'9'){
                        return 0;
                    }else{
                        if(arr[0] =='+'){
                            s += Integer.parseInt(String.valueOf(arr[i]))*Math.pow(10,arr.length-(i+1));
                        }else if(arr[0] =='-'){
                            s -= -Integer.parseInt(String.valueOf(arr[i]))*Math.pow(10,arr.length-(i+1));
                        }

                    }
                }
            }else if(arr[0]>'0' && arr[0]<='9'){
                for(int i =0;i<arr.length;i++){
                    if(arr[i]<'0' ||arr[i]>'9'){
                        return 0;
                    }else{
                        s += Integer.parseInt(String.valueOf(arr[i]))*Math.pow(10,arr.length-(i+1));
                    }
                }
            }
        }
        if(arr[0] =='-' && -s <Integer.MIN_VALUE){
            return 0;
        }else if(arr[0] =='+' && s > Integer.MAX_VALUE){
            return 0;
        }
        return (int)s;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        String str = "-2147483649";
        int m = StrToInt(str);
        System.out.println(m);
    }
}
