package codeing;

public class leetcode_104 {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        return Math.max(a,b)+1;
    }
}
