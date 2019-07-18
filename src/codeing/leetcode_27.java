package codeing;

/**
 * @ClassName leetcode_27
 * @Description TODO
 * @Author 李怀鹏
 * @Date 2019/5/14 21:58
 * @Version 1.0
 **/
public class leetcode_27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,4};
        int val = 2;
        leetcode_27 leetcode_27 = new leetcode_27();
        System.out.println(leetcode_27.removeElement(arr,val));
        for (int i : arr){
            System.out.println(i);
        }
    }
}
