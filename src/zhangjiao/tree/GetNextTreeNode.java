package zhangjiao.tree;

public class GetNextTreeNode {
    public class TreeLinkNode{
        int val;
        TreeLinkNode left=null;
        TreeLinkNode right=null;
        TreeLinkNode next=null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    //找出中序遍历的下一个节点并返回
    public TreeLinkNode GetNext(TreeLinkNode p){
        //如果该节点的右子树不为空，则寻找右子树的最左节点
        //如果该节点右子树为空，则向上遍历父节点，若该节点为左孩子节点，则选父节点；否则继续向上遍历
        if(p.right!=null){
            TreeLinkNode n=p.right;
            while(n.left!=null)
                n=n.left;
            return n;
        }
        else{
            TreeLinkNode parent=null;
            while(p.next!=null)
            {
                parent=p.next;
                if(parent.left==p)
                    return parent;
                p=p.next;
            }
            return null;
        }
    }

}
