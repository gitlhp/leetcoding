package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName leetcode_3 未通过
 * @Description 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @Author 李怀鹏
 * @Date 2019/5/5 15:45
 * @Version 1.0
 **/
public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int resultLength = 0;
        if (s==""){
            return 1;
        }
        else if (judgeResult(s,0,n)){
            return n;
        }
        else if (s.charAt(0)==s.charAt(1)){
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(judgeResult(s, i , j)){
                        resultLength = Math.max(resultLength, j - i);
                    }
                }
            }
            resultLength++;
        }else {
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(judgeResult(s, i , j)){
                        resultLength = Math.max(resultLength, j - i);
                    }
                }
            }
        }
        return resultLength;
    }
    public boolean judgeResult(String s, int begin, int end){
        //Set<Character> chr = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for(int i = begin; i < end; i++){
            Character charStr = s.charAt(i);
            if(list.contains(charStr)){
                return false;
            }else{
                list.add(charStr);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        leetcode_3 leetcode_3 = new leetcode_3();
        int n = leetcode_3.lengthOfLongestSubstring(s);
        System.out.println(n);
    }
}
