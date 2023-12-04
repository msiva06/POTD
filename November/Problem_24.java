package November;
import java.util.Arrays;

// Maximum number of coins you can get
public class Problem_24 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        for(int i = piles.length/3; i < piles.length; i+= 2){
            ans += piles[i];
        }
        return ans;
    }
}
