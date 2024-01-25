package January;

// Longest common subsequence
public class Problem_24 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] memo = new int[n+1][m+1];
        for(int i = 1; i < memo.length; i++){
            for(int j = 1; j < memo[i].length; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    memo[i][j] = 1+memo[i-1][j-1];
                }
                else{
                    memo[i][j] = Math.max(memo[i-1][j],memo[i][j-1]);
                }
            }
        }
        return memo[n][m];
        // for(int[] row : memo)
        //     Arrays.fill(row,-1);
        // return longest(n-1,m-1,text1,text2,memo);
    }

    public int longest(int id1, int id2,String t1, String t2,int[][] memo){
        if(id1 < 0 || id2 < 0)
            return 0;
        if(memo[id1][id2] != -1)
            return memo[id1][id2];
        if(t1.charAt(id1) == t2.charAt(id2)){
            return memo[id1][id2] = 1 + longest(id1-1,id2-1,t1,t2,memo);
        }
        else{
            return memo[id1][id2] = Math.max(longest(id1-1,id2,t1,t2,memo),longest(id1,id2-1,t1,t2,memo));
        }

    }
}
