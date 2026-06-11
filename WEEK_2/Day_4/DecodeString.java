package WEEK_2.Day_4;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int num=0;
        String cur = "";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){ 
                st.push(cur); 
                st.push(String.valueOf(num)); 
                cur=""; 
                num=0; 
            }
            else if(c==']'){ 
                int k =Integer.parseInt(st.pop()); 
                String prev = st.pop(); 
                StringBuilder temp = new StringBuilder();
 
                for(int i =0; i<k;i++){ 
                    temp.append(cur); 
                } 
                cur=prev+temp.toString(); 
            }
            else{ 
                cur+=c; 
            } 
        
        } 
        return cur;
        }
    
}
