/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num == null) return null;
        return bst(num, 0, num.length - 1);
    }
    private TreeNode bst(int[] num, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode tempRoot = new TreeNode(num[mid]);
        tempRoot.left = bst(num, start, mid - 1);
        tempRoot.right = bst(num, mid + 1, end);
        return tempRoot;
    }
}