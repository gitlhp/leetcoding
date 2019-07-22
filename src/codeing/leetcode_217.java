package codeing;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class leetcode_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set =new HashSet<>();
        for (int i :nums){
            if (!set.add(i)){
                return true;
            }
            set.add(i);
        }
        if (set.size()==nums.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        leetcode_217 leetcode_217=new leetcode_217();
        int[] arr ={1,2,3,4};
        System.out.println(leetcode_217.containsDuplicate(arr));
    }
}
