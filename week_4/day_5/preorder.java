class preorder {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int left, int right) {

        if (left > right) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int index = left;

        // find root in inorder array
        for (int i = left; i <= right; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        root.left = build(preorder, inorder, left, index - 1);
        root.right = build(preorder, inorder, index + 1, right);

        return root;
    }
}