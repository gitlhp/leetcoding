package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName leetcode_8
 * @Description 8. 字符串转换整数 (atoi)
 * @Author 李怀鹏
 * @Date 2019/5/8 15:08
 * @Version 1.0
 **/
public class leetcode_8 {
    public int myAtoi(String str) {
        String str1 = str.replaceAll(" ","");
        List<String> list = new ArrayList<>();//存放输出值
        int n = str1.length();
        if (n==0||!iscontainshuzi(str1.substring(0,1))){//为空，null,去空格后头字符非整数包括“-”，0不行
            return 0;
        }else {
            String s = String.valueOf(str1.charAt(0));// "4193 with words"
            if (s.equals("-")&&n==1){//开头为“-”,但只有“-”
               return 0;
                }else if (s.equals("-")&&n!=1&&String.valueOf(str1.charAt(1)).equals("-")){//"---"
                return 0;
            }else if (s.equals("-")&&n!=1&&!String.valueOf(str1.charAt(1)).equals("-")&&!iscontainshuzi(String.valueOf(str1.charAt(1)))){//"-ww"
                return 0;
            }else if(s.equals("-")&&n!=1){//"-2233cc
                list.add(s);
                for (int i=1;i<n;i++){//从第二个判断是否为数字
                    if (iscontainshuzi(String.valueOf(str1.charAt(i)))&&!String.valueOf(str1.charAt(i)).equals("-")){//判断第二位开始是否为数字
                        list.add(String.valueOf(str1.charAt(i)));
                    }
                    else
                        return 0;
                }
            }

        }


return 1;
    }
    public boolean iscontainshuzi(String s){
        String str[]={"-","1","2","3","4","5","6","7","8","9"};
        for (int i=0;i<str.length;i++){
            if (str[i].equals(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s ="  -222 ee3 2  ";
        String c = null;
        String str1 = s.replaceAll(" ","");
        System.out.println(str1);
        System.out.println(str1.substring(0,1));
        System.out.println(c.equals(""));
    }
}
