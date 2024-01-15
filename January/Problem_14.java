package January;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find players with zero or one losses
public class Problem_14 {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lostCount = new int[100001];
        Arrays.fill(lostCount,-1);
        for(int i = 0; i < matches.length; i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
            if(lostCount[winner] == -1)
                lostCount[winner] = 0;
            if(lostCount[loser] == -1)
                lostCount[loser] = 1;
            else if(lostCount[loser] >= 0)
                lostCount[loser] += 1;
        }
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int i = 0; i < lostCount.length; i++){
            if(lostCount[i] == 0){
                ans.get(0).add(i);
            }
            if(lostCount[i] == 1){
                ans.get(1).add(i);
            }
        }
        return ans;
    }
}
