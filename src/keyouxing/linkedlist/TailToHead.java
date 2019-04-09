package keyouxing.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    
}

public class TailToHead {
	
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	
    	ArrayList<Integer> results = new ArrayList<>();
    	
    	Stack<ListNode> stackNodes = new Stack<ListNode>();
    	
    	ListNode temp = listNode;
    	while(temp != null) {
    		
    		stackNodes.push(temp);
    		temp = temp.next;
    		
    	}
    	
    	while(!stackNodes.isEmpty()) {
    		results.add(((ListNode)stackNodes.pop()).val);
    	}
    	
		return results;

   }
    
    
	public static void main(String[] args) {
		
		TailToHead solution = new TailToHead();
		
		ListNode root = new ListNode(0);
		ListNode node_1 = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		
		root.next = node_1;
		node_1.next = node_2;
		node_2.next = node_3;
		
		ArrayList<Integer> results = solution.printListFromTailToHead(root);
		
		for(int i=0; i<results.size(); i++) {
			System.out.println(results.get(i));
		}
		
	}
}