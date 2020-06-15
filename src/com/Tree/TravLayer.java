package com.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TravLayer {
    public void travLayer(BinNode node){
        if(node == null)
            return;
        Queue<BinNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            node = queue.poll();
            list.add(node.val);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }
}
