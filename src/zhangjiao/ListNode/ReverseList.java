package zhangjiao.ListNode;
public class ReverseList {
    //输入一个链表，反转链表后，输出新链表的表头
    public ListNode reverseList(ListNode head){
        ListNode newList=new ListNode(-1);
        while(head!=null){//头插法
            ListNode next=head.next;//保存剩下链表的头节点
            head.next=newList.next;
            newList.next=head;
            head=next;
        }
        return newList.next;
    }
}
