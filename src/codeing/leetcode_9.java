package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName leetcode_9
 * @Description 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @Author 李怀鹏
 * @Date 2019/5/6 14:27
 * @Version 1.0
 **/
public class leetcode_9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int n = str.length();
        List<String> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(String.valueOf(str.charAt(i)));
        }
        if (x>=0&&x<=9){
            return true;
        }else if (x<0){
            return false;
        }else if (n%2==0){//偶数
            for (int i=0;i<n;i++){
                if (list.get(i).equals(list.get(n-i-1))){
                    if ((i+1)==n/2)
                        return true;
                }else
                    return false;
            }
            return true;
        }else if (n%2!=0){//奇数
            for (int i=0;i<n;i++){
                if (list.get(i).equals(list.get(n-i-1))){
                    if ((i+1)==n-1/2){
                        return true;
                    }
                }else
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        leetcode_9 leetcode_9 = new leetcode_9();
        boolean b =leetcode_9.isPalindrome(12231);
        System.out.println(b);
    }
}
