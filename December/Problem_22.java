package December;

// Maximum score after splitting a string
public class Problem_22 {
    public int maxScore(String s) {
        int onesCount = 0, zerosCount = 0;
        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - '0';
            if(num == 1)
                onesCount++;
        }
        int ans = 0;
        for(int i = 0; i < s.length() -1; i++){
            int num = s.charAt(i) - '0';
            if(num == 1){
                onesCount--;
            }
            else{
                zerosCount++;
            }
            ans = Math.max(ans,onesCount+zerosCount);
        }
        return ans;
    }
}
