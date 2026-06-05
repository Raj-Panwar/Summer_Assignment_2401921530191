class Solution {
    public static boolean palinornot(String s){
  
        boolean flag=true;
        int beg=0;
        int end=(s.length()-1);
        while(beg<end){
            if(s.charAt(beg)!=s.charAt(end)){
                flag = false;
            }
            beg++;
            end--;

        }
        if(flag==true){
            return true;
        }
        else{
            return false;
        }

    }
     public static String clean(String input) {
        if (input == null) {
            return null; 
        }       
        String regex = "[^a-zA-Z0-9]";

        
        String cleanedString = input.replaceAll(regex, "");

       
        return cleanedString.toLowerCase();
    }
    public boolean isPalindrome(String s) {
        
        boolean ans = palinornot(clean(s));
        return ans;

        
    }
}