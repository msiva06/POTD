package January;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Longest Increasing subsequence
public class Problem_05 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);
        for(int i = 1; i < n; i++){
            if(nums[i] > res.get(res.size()-1))
                res.add(nums[i]);
            else{
                int idx = Collections.binarySearch(res,nums[i]);
                if(idx < 0)
                    idx = - idx - 1;
                res.set(idx,nums[i]);
            }
        }
        return res.size();
        
    }
}
