package WEEK_4.Day_2;
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);
            for(int i =0; i<levelsize; i++){
                TreeNode current = queue.poll();
                currentlevel.add(current.val);
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
                
            }
            ans.add(currentlevel);

        }
        return ans;
        
    }
}

