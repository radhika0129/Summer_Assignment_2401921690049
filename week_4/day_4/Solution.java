// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // recursively find left and right height
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // update diameter (longest path through this node)
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // return height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}