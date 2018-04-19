import java.util.Queue;
import java.util.LinkedList;

public class SymmetricTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()){
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();

            if(node1 == null && node2 == null)
                continue;
            if(node1 == null || node2 == null)
                return false;
            if(node1.val != node2.val)
                return false;

            q.add(node1.left);
            q.add(node2.right);
            q.add(node1.right);
            q.add(node2.left);
        }

        return true;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(2);
//        head.left.left = new TreeNode(3);
        head.left.right = new TreeNode(3);
//        head.right.left = new TreeNode(4);
        head.right.right = new TreeNode(3);

        SymmetricTree symmetricTree = new SymmetricTree();
        boolean result = symmetricTree.isSymmetric(head);
        System.out.println(result);
    }
}
