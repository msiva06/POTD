package March;

import java.util.ArrayList;
import java.util.List;

// Find all duplicates in the array
public class Problem_25 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] > 0){
                nums[idx] *= -1;
            }
            else{
                res.add(idx+1);
            }
        }
        return res;
    }
}
}
