import java.util.HashMap;
import java.util.Map;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
 class ReConstructTree {
    private  Map<Integer,Integer> indexForInOrders=new HashMap<>();
    public  TreeNode reConstructBinaryTree(int[]pre,int[]in){
        for(int i=0;i<in.length;i++)
            indexForInOrders.put(in[i],i);
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }
    private  TreeNode reConstructBinaryTree(int[]pre,int preL,int preR,int inL) {

        if(preL>preR)
            return null;
        TreeNode root=new TreeNode(pre[preL]);
        int inIndex=indexForInOrders.get(root.val);
        int leftTreeSize=inIndex-inL;
        root.left=reConstructBinaryTree(pre,preL+1,preL+leftTreeSize,inL);
        root.right=reConstructBinaryTree(pre,preL+1+leftTreeSize,preR,inL+leftTreeSize+1);
        return root;
    }
}
public class ReConstructBinaryTree {
    public static void print(TreeNode root){
        if(root!=null){
            print(root.left);
            print(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[]args){
        int[]pre={1,2,4,7,3,5,6,8};
        int[]in={4,7,2,1,5,3,8,6};
        ReConstructTree t=new ReConstructTree();
        TreeNode root=t.reConstructBinaryTree(pre,in);
        print(root);
    }


}
