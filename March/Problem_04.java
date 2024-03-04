package March;

import java.util.Arrays;

// Bag of tokens
public class Problem_04 {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length -1 ;
        int score = 0;
        int maxScore = 0;
        while(left <= right){
            if(tokens[left] <= power){
                score +=1;
                power -= tokens[left];
                left++;
            }
            else if(score > 0){
                score -= 1;
                power += tokens[right];
                right--;
            }
            else{
                break;
            }
            maxScore = Math.max(score,maxScore);
        }
        return maxScore;
    }
}
