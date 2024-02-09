package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Largest Divisible subset
public class Problem_09 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] hash = new int[n];
        for(int i = 0; i < n; i++){
            hash[i] = i;
        }

        int maxi = Integer.MIN_VALUE;
        int lastIdx = -1;
        for(int i = 0; i < n; i++){
            for(int prev = 0; prev < i; prev++){
                if(nums[i] % nums[prev] == 0 && dp[i] < 1 + dp[prev]){
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                lastIdx = i;
            }
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[lastIdx]);
        while(hash[lastIdx] != lastIdx){
            lastIdx = hash[lastIdx];
            temp.add(nums[lastIdx]);
        }
        Collections.reverse(temp);
        return temp;
    }
}
