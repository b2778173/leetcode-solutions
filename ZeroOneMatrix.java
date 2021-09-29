import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[] { i, j });
                } else {
                    mat[i][j] = 10000;
                }
            }
        }
        int dist = 0;
        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int size = q.size();
            int x = cur[0];
            int y = cur[1];
            dist++;
            for (int i = 0; i < size; i++) {
                if (x + 1 < m && mat[x + 1][y] == 10000) {
                    mat[x + 1][y] = dist;
                    q.add(new int[] { x + 1, y });
                }
                if (x - 1 >= 0 && mat[x - 1][y] == 10000) {
                    mat[x - 1][y] = dist;
                    q.add(new int[] { x - 1, y });
                }
                if (y + 1 < n && mat[x][y + 1] == 10000) {
                    mat[x][y + 1] = dist;
                    q.add(new int[] { x, y + 1 });
                }
                if (y - 1 >= 0 && mat[x][y - 1] == 10000) {
                    mat[x][y - 1] = dist;
                    q.add(new int[] { x, y - 1 });
                }
            }
        }
        return mat;
    }
}
