import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            TreeNode cur = q.remove(); // root
            if (cur != null) {
                sb.append(cur.val);
                q.add(cur.left);
                q.add(cur.right);
            } else {
                sb.append("X");
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        System.out.print(data);
        if (data.length() == 0)
            return null;
        String[] arr = data.split(",");
        // string queue
        Queue<String> q = new LinkedList<>();
        for (String a : arr) {
            q.add(a);
        }
        // node queue
        Queue<TreeNode> nodeQ = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(q.remove()));
        nodeQ.add(root); // 加入 root

        while (!nodeQ.isEmpty()) {
            TreeNode curNode = nodeQ.remove();
            String left = q.remove();
            String right = q.remove();

            if (!left.equals("X")) {
                curNode.left = new TreeNode(Integer.parseInt(left));
                nodeQ.add(curNode.left);
            }
            if (!right.equals("X")) {
                curNode.right = new TreeNode(Integer.parseInt(right));
                nodeQ.add(curNode.right);
            }
        }
        return root;
    }
}
