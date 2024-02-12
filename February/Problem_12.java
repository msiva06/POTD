package February;

// Majority Element(more than n/2)
public class Problem_12 {
    public int majorityElement(int[] nums) {
        int elem = Integer.MIN_VALUE;
        int occur = 0;
        int n = nums.length;
        for(int num : nums){
            if(elem == Integer.MIN_VALUE){
                elem = num;
            }
            if(num == elem){
                occur++;
            }
            else{
                occur--;
            }
            if(occur == 0){
                elem = num;
                occur = 1;
            }
        }
        return elem;
    }
}
