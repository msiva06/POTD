package December;

// Calculate money in bank
public class Problem_06 {
    public int totalMoney(int n) {
        int monday = 0;
        int i = 1;
        int totalMoney = 0;
        int currMoney = 0;
        int prevMoney = 0;
        while(i <= n){
          if(i % 7 == 1){
            monday += 1;
            currMoney = monday;
          }
          else{
            currMoney = prevMoney +1;
          }
          totalMoney += currMoney;
          prevMoney  = currMoney;
          i++;
        }
        return totalMoney;
    }
}
