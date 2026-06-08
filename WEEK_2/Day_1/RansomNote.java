class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chr1 = new int[26];
        int[] chr2 = new int[26];
        for(char c : ransomNote.toCharArray()){
            chr1[c-'a']++;
        }
        for(char c : magazine.toCharArray()){
            chr2[c-'a']++;
        }
        for(int i =0; i<26; i++){
            if(chr2[i]<chr1[i]){
                return false;
            }
        }
        return true;
        
    }
}