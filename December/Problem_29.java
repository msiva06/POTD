package December;

// Min time to make rope colorful
public class Problem_29 {
    public int minCost(String colors, int[] neededTime) {
        int left = 0,  right = 0;
        int totalTime = 0;
        while(left < neededTime.length && right < neededTime.length){
           int currTotal = 0, currMax = 0;
           while(right < neededTime.length && colors.charAt(left) == colors.charAt(right)){
               currTotal += neededTime[right];
               currMax = Math.max(currMax,neededTime[right]);
               right++;
           }
           int minTime = currTotal - currMax;
           totalTime += minTime;
           left = right;
        }
        return totalTime;
    }
}
