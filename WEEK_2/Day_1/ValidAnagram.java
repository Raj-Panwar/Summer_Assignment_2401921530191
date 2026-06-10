import java.util.HashMap;

class Solution {

    static HashMap<Character, Integer> fremap(String st){
        HashMap<Character, Integer> mp = new HashMap<>();
        int sz = st.length();
        for(int i = 0; i<sz; i++){
            Character ch = st.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                int curfe = mp.get(ch);
                mp.put(ch, curfe+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> m1 = fremap(s);
        HashMap<Character, Integer> m2 = fremap(t);
        return m1.equals(m2);
        
    }
}