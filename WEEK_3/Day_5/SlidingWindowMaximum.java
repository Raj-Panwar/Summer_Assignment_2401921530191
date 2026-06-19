package WEEK_3.Day_5;
import java.util.*;
class Solution {
 /*   
    BRUTE FORCE ---> O(nk)
 
 
    public int maxwin(int[] nums, int st, int end) {
        int max = nums[st];
        for (int i = st+1; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList();
        ans.add(maxwin(nums, 0, k));
        for (int i = 1; i <=nums.length - k; i++) {
            ans.add(maxwin(nums, i, i + k));
        }
        int[] ansfin = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansfin[i] = ans.get(i);
        }
        return ansfin;
    }




    OPTIMIZED USING DEQUE---> O(n)
    */
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] ans = new int[nums.length-k+1];
        int write=0;
        for(int i=0; i<nums.length; i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            dq.addLast(i);
            if(i>=k-1){
                ans[write++]=nums[dq.peekFirst()];
            }
        }
    return ans;
    }
}
