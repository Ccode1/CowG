package com.Tree;

public class BinNode {
    static Integer size = 0;
    BinNode parent;
    BinNode left;
    BinNode right;
    Integer val;
    Integer height;

    public BinNode() {

    }

    public static Integer getSize() {
        return size;
    }
    private static Integer size() {
        return size;
    }
    BinNode(int val){
        this.val = val;
        size++;
    }

}
