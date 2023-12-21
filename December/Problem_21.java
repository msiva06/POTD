package December;

import java.util.Arrays;

// Widest vertical area between two points containing no points
public class Problem_21 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b) -> a[0] - b[0]);
        int maxDistance = 0;
        for(int i = 1; i < points.length; i++){
            int distance = points[i][0] - points[i-1][0];
            maxDistance = Math.max(distance,maxDistance);
        }
        return maxDistance;
    }
}
