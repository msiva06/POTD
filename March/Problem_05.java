package March;

// Minimum length of string after deleting similar ends
public class Problem_05 {
    public int minimumLength(String s) {
        int left = 0, right = s.length()-1;
        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            while(left <= right && s.charAt(left) == c){
                left++;
            }
            while(right > left && s.charAt(right) == c){
                right--;
            }
        }
        return right - left +1;
    }
}
