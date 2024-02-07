package February;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Sort characters by frequency
public class Problem_07 {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c,0) + 1);
            maxFreq = Math.max(maxFreq,freq.get(c));
        }

        List<List<Character>> bucketSort = new ArrayList<>();
        for(int i = 0; i <= maxFreq; i++){
            bucketSort.add(new ArrayList<>());
        }
        for(Character c : freq.keySet()){
            int val = freq.get(c);
            bucketSort.get(val).add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = bucketSort.size()-1; i >= 1; i--){
            List<Character> chars = bucketSort.get(i);
            for(Character c : chars){
                for(int j =0; j < i; j++){
                    sb.append(c);
                }
            }
        }

        return sb.toString();


    }
}
