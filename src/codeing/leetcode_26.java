package codeing;

/**
 * @ClassName leetcode_26
 * @Description . 删除排序数组中的重复项 空间复杂度O（1）
 * @Author 李怀鹏
 * @Date 2019/5/14 14:40
 * @Version 1.0
 **/
public class leetcode_26 {
    public static int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=1;i<nums.length;i++){
            if(nums[a]!=nums[i])
            {
                nums[++a]=nums[i];
            }
        }
        for (int j:nums) {
            System.out.println(j);
        }
        return a+1;
    }

    public static void main(String[] args){
        int[] ss = new int[]{1,1,2,2,3,3,3,4};
       int n = leetcode_26.removeDuplicates(ss);
       System.out.println(n);

    }
}
