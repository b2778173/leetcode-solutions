import java.util.*;

public class TheSkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        List<int[]> bp = new ArrayList<>();
        for (int[] b : buildings) {
            bp.add(new int[] { b[0], -b[2] });
            bp.add(new int[] { b[1], b[2] });
        }
        Collections.sort(bp, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // order by x acending
            } else {
                return b[1] - a[1]; // order by y decending
            }
        });
        PriorityQueue<Integer> heightPQ = new PriorityQueue<>((a, b) -> b - a); // reverse natural order
        heightPQ.add(0); // init
        int preHeight = 0;
        int curHeight = 0;
        for (int[] pos : bp) {
            int x = pos[0];
            int y = pos[1];
            if (y != preHeight) {
                if (y < 0) {
                    heightPQ.add(-y);
                }
                curHeight = heightPQ.peek();
                List<Integer> res = new ArrayList<Integer>();
                res.add(x, curHeight);
                ans.add(res);
            } else {
                heightPQ.remove(y);
            }
            preHeight = curHeight;
        }
        return ans;
    }
}
