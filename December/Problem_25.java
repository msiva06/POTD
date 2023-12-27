package December;

import java.util.Arrays;

// Decode ways
public class Problem_25 {
    public int numDecodings(String s) {
        int[] memo = new int[s.length()+1];
        Arrays.fill(memo, -1);
        return decode(0,s,memo);
    }

    public int decode(int idx, String s,int[] memo){
        if(idx == s.length())
            return 1;
        if(s.charAt(idx) == '0')
            return 0;
        if(idx == s.length()-1)
            return 1;
        if(memo[idx] != -1)
            return memo[idx];
        int ans = decode(idx+1,s,memo);
        if(Integer.parseInt(s.substring(idx,idx+2)) <= 26)
            ans += decode(idx+2,s,memo);
        memo[idx] = ans;
        return ans;
    }
}
