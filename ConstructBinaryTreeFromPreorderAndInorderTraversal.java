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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) return null;
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length -1);
    }
    
    private TreeNode build(int[] preorder, int start1, int end1, int[] inorder, int start2, int end2) {
        if(start1 > end1) return null;
        int rootVal = preorder[start1];
        TreeNode root = new TreeNode(rootVal);
        if(start1 < end1) {
            int index = start2;
            while(index <= end2) {
                if(inorder[index] == rootVal) break;
                index ++;
            }
            root.left = build(preorder, start1 + 1, start1 + index - start2, inorder, start2, index - 1);
            root.right = build(preorder, start1 + index - start2 + 1, end1, inorder, index + 1, end2);
        }
        return root;
    }
}