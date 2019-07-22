package codeing;

import java.util.Stack;

public class leetcode_206 {
    //超时
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> stack=new Stack<>();
//        while (head != null) {
//            stack.push(head);
//            head=head.next;
//        }
//        head=stack.pop();
//        ListNode temp =head;
//        while (!stack.empty()){
//            temp.next=stack.pop();
//            temp=temp.next;
//        }
//        return head;
//    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;//保存前一个元素
        ListNode cuur = head;//保存当前元素
        while (cuur!=null){
            ListNode next = cuur.next;//记录下一个节点
            cuur.next=prev;
            prev=cuur;
            cuur=next;
        }
        return prev;
    }
}
