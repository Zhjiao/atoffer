class ListNode{
    int val;
    ListNode next=null;
    ListNode(int n){
        val=n;
    }
}
public class DeleteNode{

   public ListNode deleteNode(ListNode head,ListNode tobeDelete){
//   ① 如果该节点不是尾节点，那么可以直接将下一个节点的值赋给该节点，然后令该节点指向下下个节点，再删除下一个节点，时间复杂度为 O(1)。
//   ② 如果链表只有一个节点，那么直接返回null
//   ③ 如果链表不止一个节点，那么从头遍历找到该节点的上一个节点
       if(head==null||tobeDelete==null)
           return head;
       if(tobeDelete.next!=null){
           tobeDelete.val=tobeDelete.next.val;
           tobeDelete.next=tobeDelete.next.next;

       }else{
           if(head==tobeDelete)
               head=null;
           else
           {
               ListNode cur=head;
               while(cur.next!=tobeDelete)
                   cur=cur.next;
               cur.next=null;
           }
       }
       return head;
   }

   public static void main(String[]args){
       DeleteNode a=new DeleteNode();
       ListNode p1=new ListNode(2);
       ListNode p2=new ListNode(4);
       ListNode p3=new ListNode(3);
       ListNode p4=new ListNode(8);
       p1.next=p2;
       p2.next=p3;
       p3.next=p4;
       ListNode head=a.deleteNode(p1,p1);
       ListNode p=head;
       while(p!=null)
       {
           System.out.print(p.val+" ");
           p=p.next;
       }

   }
}
