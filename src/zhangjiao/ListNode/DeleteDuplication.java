package zhangjiao.ListNode;

public class DeleteDuplication {
//    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public ListNode deleteDuplication(ListNode pHead) {
    if (pHead == null || pHead.next == null)
        return pHead;
    ListNode next=pHead.next;
    if(pHead.val==next.val)
    {
        while(next!=null&&pHead.val==next.val)
            next=next.next;
        return deleteDuplication(next);
    }
    else
    {
        pHead.next=deleteDuplication(pHead.next);
        return pHead;
    }
}
    public static void main(String[]args){
        DeleteDuplication p=new DeleteDuplication();
        ListNode head=new ListNode(1);
        ListNode p1=new ListNode(2);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        ListNode p4=new ListNode(3);
        ListNode p5=new ListNode(4);
        head.next=p1;p1.next=p2;p2.next=p3;p3.next=p4;p4.next=p5;
        ListNode c=p.deleteDuplication(head);
        while(c!=null)
        {
            System.out.println(c.val);
            c=c.next;
        }

    }
}
