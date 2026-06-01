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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        LinkedList<Integer> level = new LinkedList<>();
        int currLvl = 0;
        while (!q.isEmpty()) {
            Pair front=q.poll();
            if(front.level!=currLvl){
                ans.add(new ArrayList<>(level));
                level=new LinkedList<>();
                currLvl++;
            }
            if(currLvl%2==0){
                level.addLast(front.node.val);
            }else{
                level.addFirst(front.node.val);
            }
            if(front.node.left!=null) q.offer(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.offer(new Pair(front.node.right,front.level+1));
        }
        ans.add(new ArrayList<>(level));
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