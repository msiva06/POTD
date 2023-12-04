package November;
import java.util.Arrays;

// Reduction operations to make array elements equal
public class Problem_19 {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, up = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1])
                up++;
            ans += up;
        }
        return ans;
        
    }
}
