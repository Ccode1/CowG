package com.Argument;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Huffman {
    private static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 根据node的值的大小，确定优先队列的队列中数值的位置 升序
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.val -o2.val;
            }
        });
        for (int i = 1;i <= n;i++){ //将数值添加进优先队列
            Node x = new Node();
            x.val = sc.nextInt();
            queue.add(x);
        }
        //创建哈夫曼树
        while (queue.size() > 1){
            Node x1 = queue.poll();
            Node x2 = queue.poll();
            Node temp = new Node();
            temp.val = x1.val + x2.val;
            temp.left = x1;
            temp.right = x2;
            queue.add(temp); // 将新合成的节点加入优先队列中，优先队列根据新加节点的大小将队列更新
        }
        Node root = queue.poll();
        dfs(root,0);
        System.out.println(res);


    }

    private static void dfs(Node node, int len) {
        if(node.left == null && node.right == null){
            res += node.val * len;
        }else{
            dfs(node.left,len + 1);
            dfs(node.right, len + 1);
        }
    }
    static class Node{
        int val;
        Node left =null;
        Node right = null;
    }

}
