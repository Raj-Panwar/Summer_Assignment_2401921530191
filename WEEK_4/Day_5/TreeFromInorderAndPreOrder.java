package WEEK_4.Day_5;

import java.util.HashMap;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] index={0};
        for(int i =0; i<inorder.length;i++){
            mp.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, preorder.length-1, mp, index);
        
    }
    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index){
        if(left>right) return null;
        int current=preOrder[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);
        if(left==right) return node;
        int inorderindex=map.get(current);
        node.left = helper(preOrder, inOrder, left, inorderindex-1, map, index);
        node.right = helper(preOrder, inOrder, inorderindex+1, right, map, index);
        return node;
    }
}
