package December;

// Minimum time to visit all points
public class Problem_03 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] prev = points[0];
        int sec = 0;
        for(int i = 1; i < points.length; i++){
            int[] curr = points[i];
            sec += Math.max(Math.abs(curr[1] - prev[1]), Math.abs(curr[0]-prev[0]));
            prev = curr;
        }
        return sec;
    }
}