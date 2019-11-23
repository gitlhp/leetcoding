package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述：给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 */

/**
 * 超时了
 */
public class leetcode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length==0){
            return list;
        }
        //先进行排序 O(n*n)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int n : nums) {
            System.out.println(n);
        }
        //计算两头
        int low = nums[0];
        int high = nums.length - nums[nums.length - 1];
        for (int p = 1; p < low; p++) {
            list.add(p);
        }
        for (int p1 = 1; p1 <= high; p1++) {
            list.add(nums[nums.length - 1] + p1);
        }
        for (int k = 0; k < nums.length - 1; k++) {
            int m = nums[k + 1] - nums[k];
            if (m == 1 || m == 0) {
                continue;
            } else {
                for (int nn = 1; nn < m; nn++) {
                    list.add(nums[k] + nn);
                }
            }
        }
        for (int oo:list){
            System.out.println("缺失值为："+oo);
        }
        return list;
    }

    public static void main(String[] args) {
        leetcode_448 leetcode_448 = new leetcode_448();
        int[] n = {};
        leetcode_448.findDisappearedNumbers(n);
    }
}
