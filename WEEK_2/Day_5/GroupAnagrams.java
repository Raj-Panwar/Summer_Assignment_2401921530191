package WEEK_2.Day_5;
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0; i<strs.length;i++){
            String cur = strs[i];
            char[] toArray = cur.toCharArray();
            Arrays.sort(toArray);
            String sorted = new String(toArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(cur);

        }
        return new ArrayList<>(map.values());
        
    }
}