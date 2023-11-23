import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arithmetic subarrays
public class Problem_23 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0;  i < l.length;i++){
            int start = l[i];
            int end = r[i];
            int[] arr = new int[end-start+1];
            int a = 0;
            for(int j = start; j <= end; j++){
                arr[a++] = nums[j];
            }
            Arrays.stream(arr).forEach(System.out::println);
            if(arr.length == 2)
            {
                res.add(true);
                continue;
            }
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            int k = 0;
            for(k = 2; k < arr.length; k++){
                if(arr[k] - arr[k-1] != diff){
                    break;
                }
            }
            if(k == arr.length)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}
