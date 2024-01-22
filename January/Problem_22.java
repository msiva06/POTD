package January;

// Set Mismatch
public class Problem_22 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int i = 0;
        while(i < nums.length){
            int val = nums[i] - 1;
            if(nums[i] == nums[val]){
                i++;
                continue;
            }
            if(nums[i] != nums[val]){
                int temp = nums[i];
                nums[i] = nums[val];
                nums[val] = temp;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j+1 != nums[j]){
                res[0] = nums[j];
                res[1] = j+1;
                break;
            }
        }
        return res;
    }
}
