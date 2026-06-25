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


public class LowestCommonAncestorBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }


        // Both nodes are smaller than root
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }


        // Both nodes are greater than root
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }


        // Current root is LCA
        return root;
    }


    public static void main(String[] args) {

        LowestCommonAncestorBST obj = new LowestCommonAncestorBST();


        // Creating BST:
        //          6
        //         / \
        //        2   8
        //       / \ / \
        //      0  4 7  9
        //        / \
        //       3   5


        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);


        TreeNode p = root.left;          // Node 2
        TreeNode q = root.right;         // Node 8


        TreeNode answer = obj.lowestCommonAncestor(root, p, q);


        System.out.println("Lowest Common Ancestor: " + answer.val);
    }
}