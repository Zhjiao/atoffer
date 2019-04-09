package keyouxing.tree;

class Tree{
	
	
	// ----------------------------------------------------- Constructors
	
	
	public Tree(int [] pre,int [] in) {
		
		initTree(pre, in);
		
	}
	
	
	// ----------------------------------------------------- Instance Variable
	
	
	public int level;
	
	public TreeNode root;
	
	
	// ----------------------------------------------------- Properties
	
	
	public int getLevel() {
		
		return level;
		
	}
	
	public TreeNode getRoot() {
		
		return root;
		
	}
	
	// ----------------------------------------------------- Construct Tree
    
	
	public TreeNode constructCore(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
		
		if(preStart > preEnd || inStart > inEnd)
			return null;
		
		TreeNode root = new TreeNode(pre[preStart]);
		
		int i=inStart;
		while(i<=inEnd) {
			if(in[i] == pre[preStart]) {
				break;
			}
			i++;
		}
		
		root.left = constructCore(pre, in, preStart+1, preStart +i-inStart, inStart, i-1);
		root.right = constructCore(pre, in, preStart +i-inStart+1, preEnd, i+1, inEnd);
		
		return root;
		
	}
	
	private int getLevelCore(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = getLevelCore(root.left);
		int right = getLevelCore(root.right);
		
		return ((left >= right) ? left : right)+1;
		
	}
	
	private void initTree(int [] pre,int [] in) {
		
		root= constructCore(pre, in, 0, pre.length-1, 0, in.length-1);
		level = getLevelCore(root);
		
	}

}
