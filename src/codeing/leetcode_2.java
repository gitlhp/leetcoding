package codeing;

/**
 * @ClassName leetcode_2
 * @Description 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 * @Author 李怀鹏
 * @Date 2019/5/5 11:26
 * @Version 1.0
 **/
//定义一个节点
class ListNode{
    int val;
    ListNode next;
    ListNode(int x)
    { val = x; }
}
public class leetcode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);//哑结点
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    //public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //    List<Integer> list1 = new ArrayList<>();
    //    List<Integer> list2 = new ArrayList<>();
    //    List<Integer> list3 = new ArrayList<>();
    //    while (l1 !=null){
    //        list1.add(l1.val);
    //        l1 = l1.next;
    //    }
    //    while (l2 !=null){
    //        list2.add(l2.val);
    //        l2 = l2.next;
    //    }
    //    //i>j
    //    if (list1.size()>=list2.size()){
    //        for (int i=0;i<list1.size();i++){
    //            if (i<list2.size()){
    //                list3.add(list1.get(i)+list2.get(i));
    //            }else
    //                list3.add(list1.get(i)+0);
    //        }
    //    }
    //    ListNode listNode = null;
    //    for (int i = 0; i <list3.size();i++){
    //        listNode = new ListNode(list3.get(i));
    //        listNode = listNode.next;
    //    }
    //    return listNode;
    //}
    //public static void main(String[] args){
    //    leetcode_2 leetcode_2 = new leetcode_2();
    //    int[] a = {2,4,3};
    //    int[] b = {5,6,4};
    //    ListNode l1 = null;
    //    ListNode l2 = null;
    //    for (int i=0;i<a.length;i++){
    //        l1 = new ListNode(a[i]);
    //        System.out.println(l1.val);
    //        l1 = l1.next;
    //    }
    //    while (l1!=null){
    //        System.out.println("llllllssssss");
    //        System.out.println(l1.val);
    //        l1 = l1.next;
    //    }
    //    for (int j =0;j<b.length;j++){
    //        l2 = new ListNode(b[j]);
    //        l2 = l2.next;
    //    }
    //    //ListNode listNode = leetcode_2.addTwoNumbers(l1,l2);
    //    while (l1!=null){
    //        System.out.println(l1.val);
    //        l1 = l1.next;
    //    }
    //    System.out.println("11111");
    //}
}
