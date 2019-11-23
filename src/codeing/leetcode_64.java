package codeing;

import java.util.Date;

/**
 * @ClassName: leetcode_64
 * @Description:c
 * @Author: lhp
 * @Date: 2019/11/23 16:37
 * @Version: V1.0
 **/
public class leetcode_64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;//长
        int n = grid[0].length;//宽
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] data = new int[m][n];
        //初始值
        data[0][0] = grid[0][0];
        //定义最左边的列值
        for (int i = 1; i < m; i++) {
            data[i][0] = data[i - 1][0] + grid[i][0];
        }
        //初始化最上边的行值
        for (int i = 1; i < n; i++) {
            data[0][i] = data[0][i - 1] + grid[0][i];
        }
        //归纳公式
        for (int i=1;i<m;i++){
            for (int j =1;j<n;j++){
                data[i][j]=Math.min(data[i-1][j],data[i][j-1])+grid[i][j];
            }
        }
        return data[m-1][n-1];
    }

    public static void main(String[] args) {
        leetcode_64 leetcode_64=new leetcode_64();
        int[][] data = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(leetcode_64.minPathSum(data));
    }

}
