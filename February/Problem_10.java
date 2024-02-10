package February;

// Palindromic substrings
public class Problem_10 {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
