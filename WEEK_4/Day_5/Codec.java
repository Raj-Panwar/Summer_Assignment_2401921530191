package WEEK_4.Day_5;
import java.util.*;
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node==null) {
                sb.append("n ");
                continue;
            }
            sb.append(node.val + " ");
            q.add(node.left);
            q.add(node.right);
        }
        return sb.toString();
        
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] val = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        q.add(root);
        for(int i = 1; i<val.length; i++){
            TreeNode parent = q.poll();
            if(!val[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(val[i]));
                parent.left=left;
                q.add(left);
            }
            if(!val[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(val[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;

        
    }
}
