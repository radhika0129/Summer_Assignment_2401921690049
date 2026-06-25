import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }


    public void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Left subtree
        inorder(root.left, result);

        // Root node
        result.add(root.val);

        // Right subtree
        inorder(root.right, result);
    }


    public static void main(String[] args) {

        BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);


        List<Integer> answer = obj.inorderTraversal(root);

        System.out.println(answer);
    }
}