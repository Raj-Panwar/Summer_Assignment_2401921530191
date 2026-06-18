package WEEK_3.Day_4;

import java.util.Stack;

class Solution {
    public int getMax(int[] arr, Stack<Integer> st, int max, int i){
        int area;
        int popped = st.pop();
        if(st.isEmpty()){
            area=arr[popped]*i;
        }
        else{
            area=arr[popped]*(i-1-st.peek());
        }
        return Math.max(max,area);
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        st.push(0);
        for(int i=0; i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                max = getMax(heights, st, max, i);
            }
            st.push(i);
        }
        int i = heights.length;
        while(!st.isEmpty()){
            max=getMax(heights, st, max, i);
        }
        return max;
        
    }
}
