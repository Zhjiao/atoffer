package zhangjiao.ListNode;

public class GetIntersectionNode2 {
    public ListNode isCross(ListNode head1,ListNode head2){
        if(head1==null||head2==null)
            return null;
        ListNode c1=hasCycle(head1);
        ListNode c2=hasCycle(head2);
        if(c1==null&&c2==null)
            return noCircle(head1,head2);
        if(c1!=null&&c2!=null)
            return bothCircle(head1,head2,c1,c2);
        return null;
    }

 /*
 * 判断是否存在环，如果存在，则找出环的入口点。
 * 入口点找法：快慢指针，块指针走两步，满指针走一步，如果存在循环，则在慢指针走完环前，总会和快指针相遇。
 * 从头指针和相遇点同时向后走，相遇的点必定是入口点。
 * */
    private static ListNode hasCycle(ListNode head) {//判断是否有环，若有环，找出入环点
        if(head==null)
            return null;
        ListNode p1=head;ListNode p2=head;
        while(p1!=null&&p2!=null&&p2.next!=null)
        {
          p1=p1.next;
          p2=p2.next.next;
          if(p1==p2)
          {
              p1=head;
              while(p1!=p2){
                  p1=p1.next;
                  p2=p2.next;
              }
              return p2;
          }
      }
      return null;
    }
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
//}

/*   如果链表都无环，则先判断链表的尾指针是否一样，
     如果不一样，则没有相交。如果一样，则找出两个链表的长度差，
     将两个链表从距离尾节点同样的距离进行扫描，
     如果相交，则必然有一处扫描节点相同。
 */
    private ListNode noCircle(ListNode head1,ListNode head2){
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
/*（2）如果链表都有环，则只肯能有下面两种情况。两种情况区分的方法为：入环点是否相同。
      如果相同,那么查找第一个相交点在环入口之前，与无环的单链表相交找第一个交点的方法一样。
      如果入环点不同，则这个相交点或者为list1 的入环点c1或者为list2的入环点c2。
*/
    private ListNode bothCircle(ListNode head1,ListNode head2,ListNode c1,ListNode c2){

        ListNode cur1=null;
        ListNode cur2=null;
        if(c1==c2){
            cur1=head1;
            cur2=head2;
            int n=0;
            while(cur1!=c1){
                n++;
                cur1=cur1.next;
            }
            while(cur2!=c2){
                n--;
                cur2=cur2.next;
            }
            if(n>0){
                cur1=head1;
                cur2=head2;
            }
            else
            {
                cur1=head2;
                cur2=head1;
            }
            n=Math.abs(n);
            while(n!=0){
                n--;
                cur1=cur1.next;
            }
            while(cur1!=cur2){
                cur1=cur1.next;
                cur2=cur2.next;
            }
            return cur1;
        }
        else
        {
            cur1=c1.next;
            while(cur1!=c1)
            {
                if(cur1==c2)
                    return c1;
                cur1=cur1.next;
            }
            return null;
        }

    }

}
