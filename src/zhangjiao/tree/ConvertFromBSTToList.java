package zhangjiao.tree;

public class ConvertFromBSTToList {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    // 要求不能创建任何新的结点，只能调整树中结点指针的指向。

    private TreeNode pre=null;
    private TreeNode head=null;
    public TreeNode Convert(TreeNode root){
        inOrder(root);
        return  head;
    }
    private void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        root.left=pre;
        if(pre!=null)
            pre.right=root;
        pre=root;
        if(head==null)
            head=root;//左子树的最左节点赋值为头节点
        inOrder(root.right);
    }
}
