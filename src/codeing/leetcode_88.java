package codeing;

import java.util.Arrays;

/**
 * @ClassName leetcode_88
 * @Description TODO
 * @Author 李怀鹏
 * @Date 2019/5/16 11:37
 * @Version 1.0
 **/
public class leetcode_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] list = new int[m+n];
        for (int i=0;i<m;i++){
            list[i]=nums1[i];
        }
        for (int j=m,k=0;j<m+n&&k<n;j++,k++){
            list[j] = nums2[k];
        }
        Arrays.sort(list);
        for (int i=0;i<m+n;i++){
            nums1[i]=list[i];
            System.out.println(nums1[i]);
        }
    }
    public static void main(String[] args){
        leetcode_88 leetcode_88 = new leetcode_88();
        int[] n ={1,2,3,0,0,0};
        int[] n1 = {2,5,6};
        int m = 3 ,m1 = 3;
        leetcode_88.merge(n,m,n1,m1);

    }
}
