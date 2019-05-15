package codeing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName leetcode_21
 * @Description TODO
 * @Author 李怀鹏
 * @Date 2019/5/14 13:33
 * @Version 1.0
 **/
public class leetcode_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            return null;
        }else {
            List<Integer> list = new ArrayList<>();
            while (l1!=null){
                list.add(l1.val);
                l1 = l1.next;
            }
            while (l2!=null){
                list.add(l2.val);
                l2 = l2.next;
            }
            Collections.sort(list);
            ListNode listNode1 = new ListNode(list.get(0));
            ListNode listNode = listNode1;
            for (int i = 1; i <list.size(); i++){
                listNode.next = new ListNode(list.get(i));
                listNode = listNode.next;
            }
            return listNode1;
        }
    }
    public static void main(String[] args){
        leetcode_21 leetcode_21 = new leetcode_21();
        ListNode listNode = new ListNode(4);
        ListNode listNode11 = new ListNode(4);
        int data[]={2,1};
        int data1[]={3,1};
        for (int i=0;i<data.length;i++){//头插法
            ListNode listNode1=new ListNode(data[i]);//创建一个节点
            listNode1.next=listNode;
            listNode = listNode1;
        }
        for (int i=0;i<data1.length;i++){//头插法
            ListNode listNode1=new ListNode(data1[i]);//创建一个节点
            listNode1.next=listNode11;
            listNode11 = listNode1;
        }
        //while (listNode!=null){
        //    System.out.println(listNode.val);
        //    listNode = listNode.next;
        //}
        //while (listNode11!=null){
        //    System.out.println(listNode11.val);
        //    listNode11 = listNode11.next;
        //}

       ListNode l3 = leetcode_21.mergeTwoLists(listNode,listNode11);
        while (l3!=null){
            System.out.println(l3.val);
            l3 = l3.next;
        }

    }
}
