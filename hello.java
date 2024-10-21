import stack.RemoveRedundantParenthesis;
import string.ReverseStrII;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import array.MissingNumber;

class hello {
    public static String name = "Nothing";

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
        // int[] nums = new int[] { -2, 9, 9, 8, 4 };
        // int k = 5;
        // int res = MaximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(nums,
        // k);
        // System.out.println(res);
        // SpiralMatrixII.spiralMatrixII(10);
        // String eventTime = "2023-11-30".concat(" ").concat("06:00:00");
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
        // HH:mm:ss");
        // System.out.println(LocalDateTime.parse(eventTime, formatter));
        // System.out.println(format(LocalDateTime.parse(eventTime, formatter),
        // "yyyy-MM-dd HH:mm:ss"));
        // BigDecimal a = new BigDecimal(2.4);
        // BigDecimal b = new BigDecimal(2.5);
        // System.out.println(a.intValue() + " " + b.intValue());
        // System.out.println(null == 1);
        List<Integer> numbList = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> numbList2 = new ArrayList<>();
        List<Integer> numbList3 = new ArrayList<>();
        // sol 1
        // for (int i = 0; i < numbList.size(); i++) {
        // int num = numbList.get(i);
        // if (num == 0) {
        // /**
        // * TODO
        // * 尝试完成把 List中的0移到最後
        // */
        // numbList3.add(num);

        // } else {
        // numbList2.add(num);
        // }
        // }
        // numbList2.addAll(numbList3);
        // System.out.println(numbList2);

        // solution 2
        Iterator<Integer> iterator = numbList.iterator();

        while (iterator.hasNext()) {
            int cur = iterator.next();
            if (cur == 0) {
                /**
                 * TODO
                 * 尝试完成把 List中的0移到最後
                 */
                iterator.remove();
                numbList2.add(cur);
            }
        }

        numbList.addAll(numbList2);
        System.out.println(numbList);

        // solution 3
        // while (numbList.contains(0)) {
        // /**
        // * TODO
        // * 尝试完成把 List中的0移到最後
        // */
        // numbList3.add(0);
        // numbList.remove(numbList.indexOf(0));

        // }
        // numbList.addAll(numbList3);
        // System.out.println(numbList);

        List<UserBehaviorSimulateJob> glUserBehaviorSimulateJobList = new ArrayList<>();

        glUserBehaviorSimulateJobList.add(new hello.UserBehaviorSimulateJob("1", "1"));
        glUserBehaviorSimulateJobList.add(new hello.UserBehaviorSimulateJob("2", "2"));
        String[] c = new String[] { "abc", "klm", "xyz", "pqr" };
        System.out.println(Arrays.asList(c));
        System.out.println(Arrays.asList("1", "1", "1", "1", "1", "1", "1"));

        List<Stream<String>> a = glUserBehaviorSimulateJobList.stream().map(e -> {
            List<String> b = Arrays.asList(e.getTargetUserName(), e.getSourceUserName());
            System.out.println("b=" + b);
            return b.stream();
        }).collect(Collectors.toList());

        System.out.println(a);

        System.out.println(ReverseStrII.reverseStrII("abcdefg", 2));
        System.out.println(ReverseStrII.reverseStrII("abcd", 4));
        System.out.println(ReverseStrII.reverseStrII("abcdefg", 1213));
        String s = "one";
        String s1 = s.concat("two");
        String s2 = s1.concat("three");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        for (int i = 10; i > 0; i--) {
            // if (i >= 3) {
            // break;
            // }
            if (i > 6)
                break;
        }
        // System.out.println(i);
        int arr[] = { 1, 2, 4 };
        for (int e : arr) {
            int i = 1;
            while (i <= e) {
                System.out.println(i++ + ",");
            }
        }

        name = "Jim";
        // begin();
        Integer x = 1;
        short y = 6;
        long z = 7;
        go(x);
        go(y);
        go(z);

        int zzz = 4;
        do {
            System.out.println(--zzz);
        } while (zzz == 0);

        // System.out.println(RemoveRedundantParenthesis.removeBrackets("((A+B)*C)"));
        // System.out.println(RemoveRedundantParenthesis.removeBrackets("((A+B)*(C-D))"));
        // System.out.println(RemoveRedundantParenthesis.removeBrackets("((A+B)*(C*D))"));
        // System.out.println(RemoveRedundantParenthesis.removeBrackets("(A*(B+C))"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("1*(2+(3*(4+5)))"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("2 + (3 / -5)"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("x+(y+z)+(t+(v+w))"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("1*(2+3*(4+5))"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("(2*(3+4)*5)/6"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("(-5)/7"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("(-5)*7"));
        System.out.println(RemoveRedundantParenthesis.removeBrackets("((2*((2+3)-(4*6))+(8+(7*4))))"));

        Permutations.permute("ABC");

        System.out.println(MissingNumber.missingNumber(new int[] { 3, 0, 1 }));

    }

    public void begin() {
        System.out.println(name);
    }

    public static void go(int x) {
        System.out.println("int");
    }

    public static void go(Short x) {
        System.out.println("Short");
    }

    public static void go(Integer x) {
        System.out.println("Integer");
    }

    public static void go(Long x) {
        System.out.println("Long");
    }

    public static String format(final LocalDateTime dateTime, final String format) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return dateTimeFormatter.format(dateTime);
    }

    static class UserBehaviorSimulateJob {
        private String targetUserName;
        private String sourceUserName;

        UserBehaviorSimulateJob(String targetUserName, String sourceUserName) {
            this.targetUserName = targetUserName;
            this.sourceUserName = sourceUserName;
        }

        public String getTargetUserName() {
            return this.targetUserName;
        }

        public String getSourceUserName() {
            return this.sourceUserName;
        }
    }

}