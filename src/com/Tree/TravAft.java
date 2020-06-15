package com.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class TravAft {
    public void travAft(BinNode node){
        if(node == null)
            return;
        Stack<BinNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty())
                node = stack.peek().right;
        }
    }
}
