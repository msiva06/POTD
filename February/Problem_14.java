package February;

// Rearrange array elements by sign
public class Problem_14 {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int positivePtr = 0;
        int negativePtr = 1;
        for(int num : nums){
            if(num > 0){
                res[positivePtr] = num;
                positivePtr += 2;
            }
            else{
                res[negativePtr] = num;
                negativePtr += 2;
            }
        }
        return res;
    }
}
