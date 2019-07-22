package codeing;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 */
public class leetcode_169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i :nums){
            Integer count = map.get(i);
            if (count==null){
                count=1;//第一次肯定为空 复制为1
            }else {
                count++;
            }
            map.put(i,count);//循环更新 value
            if (count>nums.length/2){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        leetcode_169 leetcode_169 = new leetcode_169();
        int[] nums={4,5,5,5,3,3,3};
        System.out.println(leetcode_169.majorityElement(nums));

    }
}
