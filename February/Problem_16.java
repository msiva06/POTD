package February;

import java.util.HashMap;
import java.util.Map;

// Least number of uniq integers after k removals
public class Problem_16 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int a : arr){
            freq.put(a, freq.getOrDefault(a,0)+1);
        }
        int[] count = new int[arr.length + 1];
        for(Integer val : freq.values()){
            count[val]++;
        }

        int uniq = freq.size();
        for(int i = 1; i <= arr.length; i++){
            int rem = Math.min(k/i,count[i]);
            uniq -= rem;
            k -= i * rem;
            if(k < i){
                return uniq;
            }
        }
        return 0;
    }
}
