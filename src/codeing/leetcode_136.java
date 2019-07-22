package codeing;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 */
public class leetcode_136 {
    public int singleNumber(int[] nums) {
        //借助空间
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {//存在元素则返回false
                set.remove(nums[i]);//如果存在则不添加并删除
                continue;
            }
            set.add(nums[i]);
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        leetcode_136 leetcode_136 =new leetcode_136();
        int[] arr ={4,1,2,1,2};
        System.out.println(leetcode_136.singleNumber(arr));
    }
}
