package January;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Unique number of occurences
public class Problem_16 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Integer k : map.keySet()){
            int freq = map.get(k);
            if(set.contains(freq))
                return false;
            set.add(freq);
        }
        return true;
    }
}
