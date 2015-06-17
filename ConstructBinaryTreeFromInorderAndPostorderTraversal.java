/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) return null;
        return build(postorder, 0, postorder.length -1, inorder, 0, inorder.length - 1);
    } 
    private TreeNode build(int[] postorder, int start1, int end1, int[] inorder, int start2, int end2) {
        if(start2 > end2) return null;
        int rootVal = postorder[end1];
        TreeNode root = new TreeNode(rootVal);
        if(start2 < end2) {
            int index = start2;
            while(start2 <= end2) {
                if(inorder[index] == rootVal) break;
                index ++;
            }
            root.left = build(postorder, start1, start1 + index - 1 - start2, inorder, start2, index - 1);
            root.right = build(postorder, start1 + index - start2, end1 - 1, inorder, index + 1, end2);
        }
        return root;
    }
}