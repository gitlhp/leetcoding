package codeing;

/**
 * @ClassName leetcode_66
 * @Description 66. 加一
 * @Author 李怀鹏
 * @Date 2019/5/15 16:50
 * @Version 1.0
 **/
public class leetcode_66 {
    //public int[] plusOne(int[] digits) {
    //    //digits[digits.length-1] = digits[digits.length-1]+1;
    //    //if (digits[digits.length-1]<9){
    //    //    return digits;
    //    //}else {
    //    //    int[] temp = new int[digits.length+1];
    //    //    int n = digits[digits.length-1]/10;//十位
    //    //    int m = digits[digits.length-1]%10;//个位
    //    //    temp[digits.length-1]=n;
    //    //    temp[digits.length]=m;
    //    //    for (int i=0;i<digits.length-1;i++){
    //    //        temp[i]=digits[i];
    //    //    }
    //    //    return temp;
    //    //}以上理解题意错误
    //    StringBuffer str = new StringBuffer();
    //    for (int i=0;i<digits.length;i++){
    //        str.append(digits[i]);
    //    }
    //    BigInteger b = new BigInteger(str.toString());
    //    int temp = Integer.valueOf(b.toString());
    //    String temp1 = String.valueOf(temp);
    //    int[] data = new int[temp1.length()];
    //    for (int i=0;i<temp1.length();i++){
    //        data[i]= Integer.valueOf(String.valueOf(temp1.charAt(i)));
    //    }
    //    return data;
    //
    //}
    //public int[] PlusOne(int[] digits) {
    //    int i = digits.length - 1;
    //    for (; i >= 0 && digits[i] == 9; i--) {
    //        digits[i] = 0;
    //    }
    //    if (i == -1) {
    //        digits[0] = 1;
    //        Arrays.Resize(ref digits, digits.Length + 1);
    //    }
    //    else {
    //        digits[i] += 1;
    //    }
    //    return digits;
    //}

    public static void main(String[] args){
        leetcode_66 leetcode_66 = new leetcode_66();
        int[] n ={9,8,7,6,5,4,3,2,1333,0};
       //int[] m =  leetcode_66.plusOne(n);
       // for (int i=0;i<m.length;i++){
       //     System.out.println(m[i]);
       // }

    }
}
