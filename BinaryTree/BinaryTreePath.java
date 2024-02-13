package BinaryTree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePath {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<TreeNode> path = new ArrayList<>();
        List<String> allPaths = new ArrayList<>();
        findPath(root, path, allPaths);
        return allPaths;
    }

    private void findPath(TreeNode node, List<TreeNode> path, List<String> allPaths) {
        if (node == null) {
            return;
        }
        path.add(node);
        if (node.left == null && node.right == null) {
            allPaths.add(pathString(path));
        }
        findPath(node.left, path, allPaths);
        findPath(node.right, path, allPaths);
        path.remove(node); // 返回到上一個node
    }

    private String pathString(List<TreeNode> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            TreeNode node = path.get(i);
            if (i == path.size() - 1) {
                sb.append(node.val);
            } else {
                sb.append(node.val + "->");
            }
        }
        return sb.toString();
    }
}
