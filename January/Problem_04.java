package January;

import java.util.HashMap;
import java.util.Map;

// Min operations to make array empty
public class Problem_04 {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0) + 1);
        int op = 0;
        for(Integer m : map.keySet()){
            if(map.get(m) == 1)
                return -1;
            op+= Math.ceil((double)map.get(m)/3);
        }
        return op;
    }
}
