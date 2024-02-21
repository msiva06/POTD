package February;

import java.util.Arrays;

// Missing number
public class Problem_19 {
    public int missingNumber(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val < nums.length){
                res[val] = val;
            }
        }

        for(int i = 0; i < res.length; i++){
            if(res[i] != i){
                return i;
            }
        }
        return res.length;
    }
}
