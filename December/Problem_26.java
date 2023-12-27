package December;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Longest Substring with atmost two distinct characters
public class Problem_26 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxWindow = Integer.MIN_VALUE;
        while(right < s.length()){
            char c = s.charAt(right);
            map.put(c, right);
            if(map.size() == 2){
                int window = right -  left +1;
                maxWindow = Math.max(maxWindow,window);
            }
            else if(map.size() > 2){
                int lastIdx = Collections.min(map.values());
                map.remove(s.charAt(lastIdx));
                left = lastIdx + 1;
            }
            right++;
        }
        if(map.size() < 2){
            return n;
        }
        return maxWindow;
    }
}
