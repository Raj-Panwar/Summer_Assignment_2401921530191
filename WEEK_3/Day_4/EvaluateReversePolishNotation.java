package WEEK_3.Day_4;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String o : tokens){
            if(o.equals("+")){
                int n1=st.pop();
                int n2=st.pop();
                st.push(n1+n2);
            }
            else if(o.equals("-")){
                int n1=st.pop();
                int n2=st.pop();
                st.push(n2-n1);
            }
            else if(o.equals("*")){
                int n1=st.pop();
                int n2=st.pop();
                st.push(n1*n2);
            }
            else if(o.equals("/")){
                int n1=st.pop();
                int n2=st.pop();
                st.push(n2/n1);
            }
            else{
                st.push(Integer.parseInt(o));
            }
            
        }
        return st.pop();

    }
}
