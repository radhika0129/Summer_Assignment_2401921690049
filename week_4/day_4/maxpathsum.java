class maxpathsum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // best path through this node
        maxSum = Math.max(maxSum, node.val + left + right);

        // return max path going upward
        return node.val + Math.max(left, right);
    }
}