import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
       
        for(int i=0; i<n; i++){
            int comp = target - nums[i];
            if(mp.containsKey(comp)){
                return new int[]{i, mp.get(comp)};
                
            }
            mp.put(nums[i], i);
        }
        return new int[]{};
    }
}