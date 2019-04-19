package zhangjiao.tree;
//判断是否是对称树
public class IsSymmetrical {
    public boolean isSymmetrical(TreeNode proot){
        if(proot==null)
            return true;
        return isSymmetrical2(proot.left,proot.right);
    }
    private boolean isSymmetrical2(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)
            return true;
        if(t1==null||t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return isSymmetrical2(t1.left,t2.right)&&isSymmetrical2(t1.right,t2.left);
    }
}
