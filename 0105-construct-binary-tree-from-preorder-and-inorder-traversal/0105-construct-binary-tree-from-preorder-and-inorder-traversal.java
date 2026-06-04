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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return build(0, n - 1, 0, n - 1, preorder, inorder);
    }

    public TreeNode build(int preLo, int preHi, int inLo, int inHi, int[] preorder, int[] inorder) {
        if (preLo > preHi)
            return null;
        int data = preorder[preLo];
        TreeNode root = new TreeNode(data);
        int r = 0;
        for (int i = inLo; i <= inHi; i++) {
            if (inorder[i] == data) {
                r = i;
                break;
            }
        }
        int cnt = r - inLo;
        root.left = build(preLo + 1, preLo + cnt, inLo, r - 1, preorder, inorder);
        root.right = build(preLo + cnt + 1, preHi, r + 1, inHi, preorder, inorder);
        return root;
    }
}