package codeing;

public class leetcode_771 {
    public int numJewelsInStones(String J, String S) {
        int n = 0;
        for (int i=0;i<S.length();i++){
            if (J.indexOf(S.charAt(i))!=-1){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        String S="ZZsssZz";
        String J="z";
        leetcode_771 leetcode_771 = new leetcode_771();
        int n = leetcode_771.numJewelsInStones(J,S);
        System.out.println(n);
    }
}
