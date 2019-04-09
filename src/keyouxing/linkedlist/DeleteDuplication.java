package keyouxing.linkedlist;

public class DeleteDuplication {
	
    public ListNode deleteDuplication(ListNode pHead)
    {
    	
    	if(pHead == null || pHead.next == null) {
    		return pHead;
    	}
    	
    	if(pHead.val == pHead.next.val) {
    		ListNode pNode = pHead.next;
    		while(pNode !=null && pNode.val == pHead.val) {
    			pNode = pNode.next;
    		}
    		return deleteDuplication(pNode);
    	}else {
    		pHead.next = deleteDuplication(pHead.next);
    		return pHead;
    	}
    	
    }
    
}
