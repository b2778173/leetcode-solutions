import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        Stack<Integer> s = new Stack<>();

        int[] newHeights = new int[heights.length + 2];
        for (int i = 0; i < heights.length; i++) {
            newHeights[i + 1] = heights[i];
        }

        for (int i = 0; i < newHeights.length; i++) {
            while (!s.isEmpty() && newHeights[i] < newHeights[s.peek()]) {
                int height = newHeights[s.pop()];
                while (!s.isEmpty() && height == newHeights[s.peek()]) {
                    s.pop();
                }
                int width;
                if (s.isEmpty()) {
                    width = i;
                } else {
                    width = i - s.peek() - 1;
                }
                area = Math.max(area, height * width);
            }
            s.push(i);
        }
        return area;
    }
}
