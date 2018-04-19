public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q == null) || (p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        TreeNode head1 = new TreeNode(1);
        TreeNode head2 = new TreeNode(1);
        head1.left = new TreeNode(2);
//        head2.left = new TreeNode(2);
//        head1.right = new TreeNode(3);
        head2.right = new TreeNode(2);

        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(head1, head2);
        System.out.println(result);

    }
}
