package codeing;

/**
 * @ClassName: leetcode_62
 * @Description:不同的路径 动态规划
 * @Author: lhp
 * @Date: 2019/11/23 16:16
 * @Version: V1.0
 **/
public class leetcode_62 {
    public int uniquePaths(int m, int n) {
        if (m <= 1 || n <= 1) {
            return 1;
        }
        int[][] data = new int[m][n];
        for (int i =0;i<n;i++){
            data[0][i]=1;
        }
        for (int i =0;i<m;i++){
            data[i][0]=1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                data[i][j]=data[i-1][j]+data[i][j-1];
            }
        }
        return data[m-1][n-1];
    }

    public static void main(String[] args) {
        leetcode_62 leetcode_62 = new leetcode_62();
        System.out.println(leetcode_62.uniquePaths(7,3));
    }
}
