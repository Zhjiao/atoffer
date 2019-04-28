package zhangjiao.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintInRow {
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印
    //最基本的层次遍历
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)
            return arr;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            TreeNode p=queue.poll();//poll()为返回第一个值并删除掉
            arr.add(p.val);
            if(p.left!=null)
                queue.add(p.left);
            if(p.right!=null)
                queue.add(p.right);
        }
        return arr;
    }

    //从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    ArrayList<ArrayList<Integer>> PrintInRows(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrs=new ArrayList<>();
        if(pRoot==null)
            return arrs;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            int count=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(count>0){
                TreeNode node=queue.poll();
                count--;
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            arrs.add(list);
        }
        return arrs;
    }

    //按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
    // 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印
    public ArrayList<ArrayList<Integer>> PrintInZ(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrs=new ArrayList<>();
        if(pRoot==null)
            return arrs;
        Queue<TreeNode> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        int key=0;
        queue.add(pRoot);
        while(!queue.isEmpty()){
            int count=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(count>0) {
                TreeNode node = queue.poll();
                count--;
                if (key % 2 == 1)
                    stack.push(node.val);
                else
                    list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            while(!stack.empty())
                list.add(stack.pop());
            arrs.add(list);
            key++;
        }
        return arrs;
    }
}
