package array;

// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]
public class SpiralMatrixII {
    public static int[][] spiralMatrixII(int n) {
        int count = 1;
        int loop = 0;
        int mid = n / 2;
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int i = 0, j = 0;
        int[][] ans = new int[n][n];
        while (loop < n / 2) {
            System.out.println("loop:" + loop);
            for (i = startX; i < n - offset; i++) {
                ans[startY][i] = count++;
            }
            for (j = startY; j < n - offset; j++) {
                ans[j][i] = count++; // i, j 到達max(n-1)
            }
            for (; i > startX; i--) {
                ans[j][i] = count++;
            }
            for (; j > startY; j--) {
                ans[j][i] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if (n % 2 != 0) {
            ans[mid][mid] = count;
        }
        return ans;
    }
}
