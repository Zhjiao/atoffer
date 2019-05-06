package zhangjiao.tree;

public class SerializeAndDeserialize {
    //请实现两个函数，分别用来序列化和反序列化二叉树

    //序列化通常是线序序列
    public String Serialize(TreeNode root){
        if(root==null)
            return "#";
        return root.val+" "+Serialize(root.left)+" "+Serialize(root.right);
    }

    private String deserializeStr;
    public TreeNode Deserialize(String str){
        deserializeStr=str;
        return Deserialize();
    }
    private TreeNode Deserialize(){
        String str1;
        int index=deserializeStr.indexOf(" ");
        if(index!=-1)
        {
            str1=deserializeStr.substring(0,index);
            deserializeStr=deserializeStr.substring(index+1);
        }else{
            str1=deserializeStr;
            deserializeStr="";
        }
        if(str1.equals("#"))
            return null;
        int val=Integer.valueOf(str1);
        TreeNode t=new TreeNode(val);
        t.left=Deserialize();
        t.right=Deserialize();
        return t;
    }
}
