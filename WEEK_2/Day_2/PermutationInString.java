package WEEK_2.Day_2;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n) return false;
        int[] freq = new int[26];
        int[] windowneed = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            windowneed[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freq, windowneed)) {
            return true;
        }
        for (int i = m; i < n; i++) {
            windowneed[s2.charAt(i) - 'a']++;
            windowneed[s2.charAt(i - m) - 'a']--;

            if (Arrays.equals(freq, windowneed)) {
                return true;
            }
        }

        return false;
    }
}