package codeing;

/**
 * @ClassName leetcode_53
 * @Description  最大子序和
 * @Author 李怀鹏
 * @Date 2019/5/16 11:01
 * @Version 1.0
 **/
public class leetcode_53 {
    public int maxSubArray(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }else if (nums.length==1){
            return nums[0];
        }else {
            int res = nums[0];
            int sum = 0;
            for (int num : nums) {
                if (sum > 0)
                    sum += num;
                else
                    sum = num;
                res = Math.max(res, sum);
            }
            return res;
        }
    }
    public static void main(String[] args){
        leetcode_53 leetcode_53 = new leetcode_53();
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(leetcode_53.maxSubArray(n));
    }
}
