package com.Argument;

public class Hanoi {
    public static void move(int n, String from, String buffer, String to) {
        if(n == 1){
            System.out.println("from '" + from +"' "+ "to '" + to+"'");
            return;
        }
        move(n-1,from,to,buffer); // 先把n-1 个圆盘从 from 移动到 buffer
        move(1,from,buffer,to); // 再将剩下的一个圆盘从from 移动到 to
        move(n-1,buffer,from ,to); // 最后将最开始那n-1个圆盘从buffer移动到to
    }

    public static void main(String[] args) {
        move(3,"a","b","c");
    }
}