package December;

import java.util.Arrays;

// Buy two chocolates
public class Problem_20 {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int chocolatePrice = prices[0] + prices[1];
        System.out.println(chocolatePrice + " " + money);
        if(chocolatePrice <= money){
            return money - chocolatePrice;
        }
        return money;
    }
}
