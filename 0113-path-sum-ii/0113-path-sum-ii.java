/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(TreeNode root, int target, List<Integer> path, List<List<Integer>> ans) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (target == root.val)
                ans.add(new ArrayList<>(path));
        }
        helper(root.left, target - root.val, path, ans);
        helper(root.right, target - root.val, path, ans);
        path.remove(path.size() - 1);
    }
}