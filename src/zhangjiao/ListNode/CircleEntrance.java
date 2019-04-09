public class CircleEntrance {
 /*
 * 判断是否存在环，如果存在，则找出环的入口点。
 * 入口点找法：快慢指针，块指针走两步，满指针走一步，如果存在循环，则在慢指针走完环前，总会和快指针相遇。
 * 从头指针和相遇点同时向后走，相遇的点必定是入口点。
 * */
    public static ListNode circleEntrance(ListNode head) {      
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
 }
