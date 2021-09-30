import java.util.*;

class hello {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 1, 1 };
        // int[] ans = intersect(nums1, nums2);
        // for (int n : ans) {
        // System.out.print(n);
        // }
        // Queue<int[]> q = new LinkedList<>();
        // q.add(new int[] { 1, 2, 3 });
        // q.add(nums1);
        // for (int[] e : q) {
        // for (int n : e) {
        // System.out.print(n);
        // }
        // System.out.println();
        // }
        // System.out.println(Parentheses.isValid("()"));
        // System.out.println(DecodeString.decodeString("3[a]2[bc]"));
        // int[][] mat = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        // System.out.println(ZeroOneMatrix.updateMatrix(mat));
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(3);
        // pq.add(2);
        // pq.add(1);
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(Pow.myPow(2.00000, 10));
        // double a = 0.1;
        // double b = 0.2;
        // float c = 0.1F;
        // float d = 0.2F;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(a + b);
        // System.out.println(b + c);
        // System.out.println(d + c);
        // int a = 1;
        // double b = (int) 1.5;
        // System.out.println(b - a);
        // int[] a = { 2, 4 };
        // int area = LargestRectangleInHistogram.largestRectangleArea(a);
        // System.out.println(area);
        // boolean[] a2 = new boolean[10];
        int[] nums = new int[] { -2, 9, 9, 8, 4 };
        int k = 5;
        int res = MaximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(nums, k);
        System.out.println(res);
    }

}