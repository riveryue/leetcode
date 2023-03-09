package tree;

public class MaxDepth {

    public int getMaxDepth(TreeNode treeNode) {
        return treeNode == null ? 0 : Math.max(getMaxDepth(treeNode.left), getMaxDepth(treeNode.right)) + 1;
    }

}
