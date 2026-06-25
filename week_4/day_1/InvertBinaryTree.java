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


public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        // Swap left and right child
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


    // Print tree
    public void printTree(TreeNode root) {

        if (root == null) {
            return;
        }

        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }


    public static void main(String[] args) {

        InvertBinaryTree obj = new InvertBinaryTree();

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);


        System.out.println("Before Invert (Inorder):");
        obj.printTree(root);

        obj.invertTree(root);

        System.out.println("\nAfter Invert (Inorder):");
        obj.printTree(root);
    }
}