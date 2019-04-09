package keyouxing.tree;


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode node)
    {
        if(node == null) return null;
        if(node.right != null) {
        	node = node.right;
        	while(node.left != null) {
        		node = node.left;
        	}
        	return node;
        }
        
        while(node.next != null) {
        	if(node.next.left == node) return node.next;
        	node = node.next;
        }
        return null;
    }
}
