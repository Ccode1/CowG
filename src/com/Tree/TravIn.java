package com.Tree;
import java.util.ArrayList;
import java.util.Stack;

public class TravIn {
    /*
        中序遍历  时间复杂度是线性的O(n) 与迭代一样。但是他们的常系数却相差特别大
     */
    public void travIn(BinNode node){
        Stack<BinNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            while (node != null){//从当前节点出发，逐批次入栈
                stack.push(node);
                node = node.left;
            }
            if(stack.isEmpty()) //直到处理完所有节点 退出循环体
                break;
            list.add( stack.pop().val);//将当前的栈顶出栈，立即访问
            if(node.right == null){//当前结点的右孩子不存在，那么出栈栈顶元素，立即访问
                node = stack.pop();
                list.add(node.val);
            }
            node = node.right; //再转向其右子树
        }

    }
}
