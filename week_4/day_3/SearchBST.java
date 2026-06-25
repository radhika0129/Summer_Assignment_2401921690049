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


public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } 
        else {
            return searchBST(root.right, val);
        }
    }


    // Inorder traversal to print result tree
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {

        SearchBST obj = new SearchBST();
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        int val = 2;

        TreeNode result = obj.searchBST(root, val);


        if (result != null) {
            System.out.println("Found BST:");
            obj.inorder(result);
        } 
        else {
            System.out.println("Value not found");
        }
    }
}