package com.Tree;
import java.util.ArrayList;
import java.util.Stack;
public class TravPre {
    //迭代方法进行二叉树的前序遍历
    /*
        思想：从根节点开始遍历左侧链，每访问当前结点，将当前结点的右孩子存入栈中
        形成这样一个顺序： 先自上而下的进行左侧链的遍历
                        然后自下而上的进行右孩子的出栈遍历（出战的右孩子重复上面的向左边遍历+ 右孩子入栈）
     */
    ArrayList<Integer> list = new ArrayList<>();
    public void travPre(BinNode node){
        if(node == null)
            return;
        Stack<BinNode> s = new Stack<>();
        while(true){
            while(node != null){
                list.add(node.val);
                if(node.right != null)
                    s.push(node.right);
                node = node.left;
            }
            if(!s.isEmpty())
                break;
            list.add(s.pop().val);
        }
    }
}
