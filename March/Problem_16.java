package March;

import java.util.HashMap;
import java.util.Map;

// Contiguous array
public class Problem_16 {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        int cnt = 0, maxCnt = Integer.MIN_VALUE;
        count.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                cnt--;
            }
            if(count.containsKey(cnt)){
                maxCnt = Math.max(maxCnt, i - count.get(cnt));
            }
            else{
                count.put(cnt,i);
            }
        }
        return maxCnt == Integer.MIN_VALUE ? 0 : maxCnt;
    }
}
