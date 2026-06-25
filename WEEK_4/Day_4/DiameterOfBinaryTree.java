package WEEK_4.Day_4;

class Solution {
   int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return dia;
    }

    public int traverse(TreeNode root){
        if(root == null) return 0;
        int leftSubTree = traverse(root.left);
        int rightSubTree = traverse(root.right);
        if(leftSubTree + rightSubTree > dia){
            dia = leftSubTree + rightSubTree;
        }
        return 1 + Math.max(leftSubTree, rightSubTree);
    }
}
