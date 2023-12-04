package November;
// Count number of homogenous substrings
public class Problem_09 {
    public int countHomogenous(String s) {
        int totalCount = 0;
        int indCount = 0;
        int i = 0;
        int mod = (int) 1e9 + 7;
        while(i < s.length()){
            if(i == 0 || s.charAt(i-1) == s.charAt(i)){
                indCount++;
            }
            else{
                indCount = 1;
            }
            totalCount = (totalCount + indCount) % mod;
            i++;
        }
        return totalCount;

    }
}
