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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(n - 1, 0, n - 1, 0, inorder, postorder);
    }

    public TreeNode build(int poHi, int poLo, int inHi, int inLo, int[] inorder, int[] postorder) {
        if(poLo>poHi) return null;
        int data = postorder[poHi];
        TreeNode root = new TreeNode(data);
        int r = 0;
        for (int i = inLo; i <= inHi; i++) {
            if (inorder[i] == data) {
                r = i;
                break;
            }
        }
        int cnt = inHi - r;
        root.left = build(poHi - cnt - 1, poLo, r - 1, inLo, inorder, postorder);
        root.right = build(poHi - 1, poHi - cnt, inHi, r + 1, inorder, postorder);
        return root;
    }
}