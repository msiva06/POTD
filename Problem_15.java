// Maximum Element after Decreasing and Rearranging
public class Problem_15 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // Arrays.sort(arr);
        // int ans = 1;
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] >= ans + 1){
        //         ans++;
        //     }
        // }
        // return ans;
        int n = arr.length;
        int[] counts = new int[n+1];
        for(int num : arr){
            counts[Math.min(num,n)]++;
        }
        int ans = 1;
        for(int i = 2; i < counts.length; i++){
            ans = Math.min(counts[i]+ans,i);
        }
        return ans;
    }
}
