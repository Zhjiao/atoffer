import java.util.ArrayList;
public class ListNodeReverse {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    //利用头插法
//        public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//            ListNode head=new ListNode(-1);
//            head.next=null;
//            while(listNode!=null)
//            {
//                ListNode node=new ListNode(listNode.val);
//                listNode=listNode.next;
//                node.next=head.next;
//                head.next=node;
//            }
//            ArrayList<Integer> res=new ArrayList<>();
//            ListNode p=head.next;
//            while(p!=null)
//            {
//                res.add(p.val);
//                p=p.next;
//            }
//            return res;
//
//        }
    
    //递归法
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<>();
        if(listNode!=null){
            res.addAll(printListFromTailToHead(listNode.next));
            res.add(listNode.val);
        }
        return res;
    }
    public static void main(String []args){
        ListNode a=new ListNode(3);//创建无头节点的链表
        ListNode p=a;
        for(int i=0;i<3;i++)
        {
            ListNode b=new ListNode(4+i);
            p.next=b;
            p=p.next;
        }
        ListNode q=a;
        while(q!=null){
            System.out.print(q.val);
            q=q.next;
        }
        System.out.println();
        ArrayList<Integer> str=printListFromTailToHead(a);
        System.out.println(str);
    }
}
