package December;

import java.util.HashMap;
import java.util.Map;

// Largest substring between two equal characters
public class Problem_32 {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxi  = -1;
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            else{
                int len = i - map.get(c) - 1;
                maxi = Math.max(maxi,len);
            }
        }
        return maxi;
    }
}
