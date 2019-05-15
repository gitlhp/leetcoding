package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName leetcode_876
 * @Description 链表的中间结点
 * @Author 李怀鹏
 * @Date 2019/5/11 9:53
 * @Version 1.0
 **/

public class leetcode_876 {
    public ListNode middleNode(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        //ListNode listNode2 = head;//保存头结点
        while (head!=null){
            listNodes.add(head);
            head = head.next;
        }
        int n = listNodes.size()/2;
        return listNodes.get(n);
        //int m=0;
        //if (n%2!=0){//奇数
        //    m = (n+1)/2;
        //    for (int i=0;i<m-1;i++){
        //        listNode2 = listNode2.next;
        //    }
        //}else {
        //    m = n/2;
        //    for (int i=0;i<m;i++){
        //        listNode2 = listNode2.next;
        //    }
        //}
        //return listNode2;
        //ListNode s=head;
        //ListNode f=head;
        //while(f!=null&&f.next!=null)
        //{
        //    s=s.next;
        //    f=f.next.next;
        //}
        //return s;
    }
    public static void main(String[] args){
        leetcode_876 leetcode_876 = new leetcode_876();
        ListNode listNode = new ListNode(6);
        int data[]={};
        for (int i=0;i<data.length;i++){//头插法
            ListNode listNode1=new ListNode(data[i]);//创建一个节点
            listNode1.next=listNode;
            listNode = listNode1;
        }
        //while (listNode!=null){
        //    System.out.println(listNode.val);
        //    listNode = listNode.next;
        //}
        ListNode listNode1=leetcode_876.middleNode(listNode);
        System.out.println(listNode1.val);

    }
}
