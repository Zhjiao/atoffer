package keyouxing.linkedlist;

public class DeleteNode {
	public ListNode deleteNode(ListNode head, ListNode delete) {
		if( head == null || delete == null) {
			return null;
		}
		//如果只有一个节点
		if(head == delete) {
			head = null;
		}
		
		if(delete.next != null) {
			ListNode deleteNext = delete.next;
			delete.val = deleteNext.val;
			delete.next = deleteNext.next;
		}else {
			ListNode temp = head;
			while(temp.next != delete) {
				temp = temp.next;
			}
			temp.next = null;
		}
		return head;
	}
}
