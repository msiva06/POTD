package March;

// First Missing Positive
public class Problem_26 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int val = nums[i]-1;
            if(val >= 0 && val < n && nums[i] != nums[val]){
                int temp = nums[i];
                nums[i] = nums[val];
                nums[val] = temp;
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < n; j++){
            if(j + 1 != nums[j]){
                return j + 1;
            }
        }
        return n+1;
    }
}
