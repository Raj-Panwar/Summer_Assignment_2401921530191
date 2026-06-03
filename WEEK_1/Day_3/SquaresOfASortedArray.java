class Solution {
    public int[] sortedSquares(int[] nums) {
        int j = nums.length-1;
        int write = nums.length-1;
        int i = 0;
        int[] ans = new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[write]=nums[i]*nums[i];
                i++;
                write--;
            }
            else{
                ans[write]=nums[j]*nums[j];
                j--;
                write--;
            }
        }
        return ans;
    }
}
