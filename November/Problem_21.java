package November;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Count nice pairs in an array
public class Problem_21 {
  public int countNicePairs(int[] nums) {
        int mod = (int)1e9 + 7;
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[i] - rev(nums[i]);
        }
        Arrays.stream(arr).forEach(System.out::println);
        Map<Integer,Integer> map = new HashMap<>();
        int ans =0;
        for(int i = 0; i < arr.length; i++){
            ans = (ans + map.getOrDefault(arr[i],0)) % mod;
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return ans;
    }

    public int rev(int num){
        int rNum = 0;
        while(num >0 ){
            int digit = num % 10;
            rNum = rNum * 10 + digit;
            num /= 10;
        }
        return rNum;
    }  
}
