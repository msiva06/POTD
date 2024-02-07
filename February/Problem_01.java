package February;

import java.util.Arrays;

// Divide array into arrays with max difference
public class Problem_01 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans= new int[nums.length/3][3];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            ans[idx][i % 3] = nums[i];
            if( i % 3 == 2){
                int differ = Math.abs(ans[idx][0] - ans[idx][2]);
                idx++;
                if(differ > k)
                {
                    return new int[][]{};
                }
            }    
        }
       
        return ans;
    }
}
