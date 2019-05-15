package codeing;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName leetcode_7 通过
 * @Description 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @Author 李怀鹏
 * @Date 2019/5/6 10:34
 * @Version 1.0
 **/
public class leetcode_7 {
    public int reverse(int x) {
        List<String> list = new ArrayList<>();//存放每一位数字
        String str = String.valueOf(x);//将数字装换成字符 -213 123
        String str1 = String.valueOf(str.charAt(0));//判断第一位是否为"-"号
        String strlast = String.valueOf(str.charAt(str.length()-1));

        long data = 0;
        if (str1.equals("-")&&!strlast.equals("0")) {//-122
            list.add(str1);
            for (int i = str.length() - 1; i > 0; i--) {
                String stri = String.valueOf(str.charAt(i));
                list.add(stri);
            }
        }else if (str1.equals("-")&&strlast.equals("0")){//-120
            list.add(str1);
            for (int i = str.length() - 2; i > 0; i--) {
                String stri = String.valueOf(str.charAt(i));
                list.add(stri);
            }
        }else if (!str1.equals("-")&&strlast.equals("0")&&!str1.equals("0")){//120
            for (int i = str.length() - 2; i >= 0; i--) {
                String stri = String.valueOf(str.charAt(i));
                list.add(stri);
            }
        }else if (str1.equals("0")){
            return 0;
        }else {
            for (int i = str.length() - 1; i >= 0; i--) {
                String stri = String.valueOf(str.charAt(i));
                list.add(stri);
            }
        }
        String strdata =list.get(0);
        for (int j = 1;j<list.size();j++){
            String strj = list.get(j);
            //System.out.println(list.get(j));
            strdata = strdata.concat(strj);
        }
        data = Long.parseLong(strdata.trim());
        //data = Integer.valueOf(strdata.trim());
        if (data<-Math.pow(2,31)||data>Math.pow(2,31)-1){
            return 0;
        }else
            return (int)data;
    }
    public static void main(String[] args){
        leetcode_7 leetcode_7 = new leetcode_7();
        //int n = 10;
        int s = leetcode_7.reverse(-120);
        System.out.println(s);

    }
}
