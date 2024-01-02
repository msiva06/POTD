package January;

import java.util.ArrayList;
import java.util.List;

// Convert an array into a 2D array with conditions
public class Problem_02 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length+1];
        List<List<Integer>> res = new ArrayList<>();
        for(int i : nums){
            if(freq[i] >= res.size()){
                res.add(new ArrayList<>());
            }
            res.get(freq[i]).add(i);
            freq[i]++;
        }
        return res;
    }
}