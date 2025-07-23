class Solution {
    class NodeSum {
        TreeNode node;
        int sum;

        NodeSum(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<NodeSum> stack = new Stack<>();
        stack.push(new NodeSum(root, root.val));

        while (!stack.isEmpty()) {
            NodeSum current = stack.pop();
            TreeNode node = current.node;
            int sum = current.sum;

            if (node.left == null && node.right == null && sum == targetSum) {
                return true;
            }

            if (node.right != null) {
                stack.push(new NodeSum(node.right, sum + node.right.val));
            }

            if (node.left != null) {
                stack.push(new NodeSum(node.left, sum + node.left.val));
            }
        }

        return false;
    }
}
