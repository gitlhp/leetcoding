package codeing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 *
 * 总结：判断两个二叉树是否完全相同==两个二叉树是否互为镜像==一个二叉树是否为镜像二叉树（参数为：root,root）
 */
public class leetcode_101 {
    //非递归 中序遍历   为考虑全部情况
    public boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        //记录当前节点
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node=stack.pop();
            list.add(node.val);
            node=node.right;
        }
        int size =list.size();
        int n = size/2;
        int m = 0;
        for (int i =0;i<n;i++){
            if (list.get(i)==list.get(size-i-1)){
                m++;
            }
        }
        if (m==n){
            return true;
        }
        return false;

    }
    //递归写法  提交正确
    public boolean isSymmetric1(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val!=t2.val){
            return false;
        }
        return  isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
    //
}
