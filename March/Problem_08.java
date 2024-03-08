package March;

import java.util.HashMap;
import java.util.Map;

// Count elements with maximum frequency
public class Problem_08 {
    public int maxFrequencyElements(int[] nums) {
        int totalfreq = 0, maxFreq = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num, map.getOrDefault(num,0)+1);
            int freq = map.get(num);
            if(freq > maxFreq){
                maxFreq = freq;
                totalfreq = freq; 
            }
            else if(freq == maxFreq){
                totalfreq += freq;
            }
        }
        return totalfreq;
    }
}