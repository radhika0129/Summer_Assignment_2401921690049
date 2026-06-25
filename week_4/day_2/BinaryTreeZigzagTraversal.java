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


public class BinaryTreeZigzagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        boolean leftToRight = true;


        while (!queue.isEmpty()) {

            int size = queue.size();

            LinkedList<Integer> level = new LinkedList<>();


            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();


                if (leftToRight) {
                    level.addLast(current.val);
                } else {
                    level.addFirst(current.val);
                }


                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }


            result.add(level);

            // Change direction
            leftToRight = !leftToRight;
        }


        return result;
    }


    public static void main(String[] args) {

        BinaryTreeZigzagTraversal obj = new BinaryTreeZigzagTraversal();

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        List<List<Integer>> answer = obj.zigzagLevelOrder(root);


        System.out.println(answer);
    }
}