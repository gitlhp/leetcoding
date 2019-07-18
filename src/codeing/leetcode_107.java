package codeing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层次遍历 II给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
public class leetcode_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //一层一个list
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {//队列不空
            int size=queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i =0;i<size;i++){
                TreeNode node = queue.poll();//弹出并删除
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(list);
        }
        List<List<Integer>> result =new ArrayList<>();
        for (int i =lists.size()-1;i>=0;i++){
            result.add(lists.get(i));
        }
        return result;
}
}
