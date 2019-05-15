package codeing;

/**
 * @ClassName leetcode_14
 * @Description 最长公共前缀
 * @Author 李怀鹏
 * @Date 2019/5/11 15:31
 * @Version 1.0
 **/
public class leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        //System.out.println(strs.length);
        if (strs==null||strs.length==0){
            return "";
        }else if (strs.length==1) {
            return strs[0];
        }else
         {
            //1.第一个字母不相同
            int n = strs.length;
            for (int j=0;j<strs[0].length();j++){
                String firststr = strs[0].substring(j,j+1);
                for (int i=1;i<n;i++){
                    if (j==strs[i].length()){
                        return strs[0].substring(0,j);
                    }else {
                        String str = strs[i].substring(j,j+1);
                        if (str.equals(firststr)){//第一个字母相同
                            continue;
                        }else if (!str.equals(firststr)&&j==0){
                            return "";
                        }else if (!str.equals(firststr)&&j>0){
                            return strs[0].substring(0,j);
                        }
                    }
                }
                if (j==strs[0].length()){
                    return strs[0];
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args){
        leetcode_14 leetcode_14 = new leetcode_14();
        String strs[] = {"aa","a"};
        String s = leetcode_14.longestCommonPrefix(strs);
        System.out.println(s);
    }
}
