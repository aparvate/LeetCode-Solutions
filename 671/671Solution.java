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
    HashMap<Integer, TreeNode> treeNodeMap = new HashMap();
    public int findSecondMinimumValue(TreeNode root) {
        traverseAndOrder(root);
        if (treeNodeMap.size() < 2){return -1;}
        else {
            System.out.println(treeNodeMap);
            Integer[] arr = treeNodeMap.keySet().toArray(new Integer[treeNodeMap.keySet().size()]);
            Arrays.sort(arr);
            return arr[1];}
    }

    public void traverseAndOrder (TreeNode root) {
        if (root.left != null) {traverseAndOrder(root.left);}
        treeNodeMap.put(root.val, root);
        if (root.right != null) {traverseAndOrder(root.right);}
    }
}