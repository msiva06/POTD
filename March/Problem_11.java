package March;

import java.util.HashMap;
import java.util.Map;

// Custom sort string
public class Problem_11 {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        while(idx < order.length()){
            char c = order.charAt(idx);
            if(map.containsKey(c)){
                int iter = map.get(c);
                while(iter > 0){
                    sb.append(c);
                    iter--;
                }
                map.remove(c);
            }
            
            idx++;
        }

        for(Character key : map.keySet()){
            int val = map.get(key);
            while(val > 0){
                sb.append(key);
                val--;
            }
        }

        return sb.toString();
    }
}
