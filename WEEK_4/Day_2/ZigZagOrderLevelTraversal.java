package WEEK_4.Day_2;
import java.util.*;
class Solution {
    public void nth1(TreeNode root, int n, List<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        nth1(root.left, n-1, ans);
        nth1(root.right, n-1, ans);
    }
    public void nth2(TreeNode root, int n, List<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        nth2(root.right, n-1, ans);
        nth2(root.left, n-1, ans);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(height(root.right), height(root.left));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int lev = height(root);
        for(int i = 1; i<=lev; i++){
            List<Integer> ans = new ArrayList<>();
            if(i%2==0){
                nth2(root, i, ans);
            }
            else{
                nth1(root, i, ans);
            }
            res.add(ans);

        }


        return res;

    }
}

