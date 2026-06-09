package WEEK_2.Day_2;
import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] needfreq = new int[26];
        int[] window = new int[26];
        int n = s.length();
        int m = p.length();
        if (m > n) return ans;
        for(char c : p.toCharArray()){
            needfreq[c-'a']++;
        }
        for(int i =0; i<m; i++){
            window[s.charAt(i)-'a']++;

        }
        if (Arrays.equals(needfreq, window)) {
            ans.add(0);
        }
        for(int i =m; i<n; i++){
            window[s.charAt(i)-'a']++;
            window[s.charAt(i-m)-'a']--;
            if (Arrays.equals(needfreq, window)) {
                ans.add(i-m+1);
            }
        }
        return ans;
        
    }
}
