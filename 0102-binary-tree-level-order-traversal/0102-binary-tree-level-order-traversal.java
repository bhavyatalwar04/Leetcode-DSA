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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<Pair>q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front=q.poll();
            if(ans.size()==front.level) ans.add(new ArrayList<>());
            ans.get(front.level).add(front.node.val);
            if(front.node.left!=null) q.offer(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.offer(new Pair(front.node.right,front.level+1));

        }
        return ans;
    }
}

class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}