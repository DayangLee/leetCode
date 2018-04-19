import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        levelRecursion(root, result, 0);
        return result;
    }

    private void levelRecursion(TreeNode node,LinkedList<List<Integer>> result, int level){
        if(node == null)
            return;
        if(result.size() < level +1){
            result.addFirst(new ArrayList<Integer>());
        }
        result.get(result.size()-1-level).add(node.val);
        levelRecursion(node.left,result,level+1);
        levelRecursion(node.right,result,level+1);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(7);

        BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
        List result = binaryTreeLevelOrderTraversalII.levelOrderBottom(root);
        System.out.println(result);
    }
}

