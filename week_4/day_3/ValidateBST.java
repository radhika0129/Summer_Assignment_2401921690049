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


public class ValidateBST {

    public boolean isValidBST(TreeNode root) {

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    public boolean check(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }


        // Check value range
        if (root.val <= min || root.val >= max) {
            return false;
        }


        // Check left and right subtree
        return check(root.left, min, root.val) &&
               check(root.right, root.val, max);
    }


    public static void main(String[] args) {

        ValidateBST obj = new ValidateBST();

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(1);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);


        System.out.println(obj.isValidBST(root));
    }
}