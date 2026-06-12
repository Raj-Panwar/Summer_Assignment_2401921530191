package WEEK_2.Day_5;

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        int n = chars.length;
        while(read<n){
           int count = 0;
           char cur = chars[read];
           while(read<n && cur==chars[read]){
                read++;
                count++;
            }
            chars[write]=cur;
            write++;
            if(count>1){
                String s = String.valueOf(count);
                for(char dig: s.toCharArray()){
                    chars[write]=dig;
                    write++;

                }
            }

        }
        return write;
        
    }
}