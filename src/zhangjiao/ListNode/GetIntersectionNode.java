/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionNode {

//假设链表中不存在环
//用栈实现，空间复杂度高
 //public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
//    Stack<ListNode> stack1=new Stack<>();
//    Stack<ListNode> stack2=new Stack<>();
//    ListNode p1=head1;ListNode p2=head2;
//    ListNode pos=null;
//    while(p1!=null)
//    {
//        stack1.push(p1);
//        p1=p1.next;
//    }
//    while(p2!=null) {
//        stack2.push(p2);
//        p2 = p2.next;
//    }
//    while(!stack1.empty()&&!stack2.empty()){
//        pos=stack1.peek();
//        ListNode l1=stack1.pop();
//        ListNode l2=stack2.pop();
//        if(l1!=l2)
//        {return l1.next;}
//    }
//    return pos;
// }
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null||head2==null)
            return null;
        ListNode cur1=head1;
        ListNode cur2=head2;
        int n=0;
        while(cur1.next!=null)
        {
            n++;
            cur1=cur1.next;
        }
        while(cur2.next!=null){
            n--;
            cur2=cur2.next;
        }
        if(cur1!=cur2) //判断尾结点是否相等
             return null;
        if(n>0)
        {
            cur1=head1;//cur指向比较长的链表
            cur2=head2;
        }
        else
        {
            cur1=head2;
            cur2=head1;
        }
        n=Math.abs(n);
        while(n!=0)
        {
            n--;
            cur1=cur1.next;
        }
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
        
    }
}
