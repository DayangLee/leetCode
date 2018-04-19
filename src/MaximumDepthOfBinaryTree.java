public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        int left,right;
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return 1;
        else
            left = maxDepth(root.left);
            right = maxDepth(root.right);
            return 1 + (left > right ? left : right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(7);

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int result = maximumDepthOfBinaryTree.maxDepth(root);
        System.out.println(result);
    }
}
