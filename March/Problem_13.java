package March;

// Pivot Integer
public class Problem_13 {
    public int pivotInteger(int n) {
        nt left = 1, right = n;
        int totalSum = (n * (n+1)) / 2;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid * mid - totalSum < 0){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }

        if(left * left == totalSum){
            return left;
        }
        return -1;
    }
}
