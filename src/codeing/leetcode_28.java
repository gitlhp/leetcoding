package codeing;

public class leetcode_28 {
    public int strStr(String haystack, String needle) {
//        if (haystack == null || needle == null) {
//            return 0;
//        }
//        if (haystack.isEmpty()&&needle.isEmpty()) {
//            return 0;
//        }
//        if (haystack.length()==0&&needle.length()==0){
//            return 0;
//        }
        if (needle.isEmpty()){
            return 0;
        }
//        if (haystack.isEmpty()){
//            return -1;
//        }
        int a = haystack.length();
        int b = needle.length();
        if (b > a) {
            return -1;
        }
        if (a == b && !haystack.equals(needle)) {
            return -1;
        }
        int n = 0;
        int nn = 0;
        for (int i = 0; i < a; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                nn = i;
                if (a - i >= b) {
                    for (int j = 0; j < b; j++) {
                        if (haystack.charAt(j + i) == needle.charAt(j)) {
                            n++;
                        }
                    }
                }
            }
            if (n==b){
                return nn;
            }else
                n = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        String a= "";
        String b="";
        leetcode_28 leetcode_28 =new leetcode_28();
        int c =leetcode_28.strStr(a,b);
        System.out.println(c);
    }
}
