package March;

import java.util.Arrays;

// Minimum number of arrows to burst balloons
public class Problem_18 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> {
            if(a[1] == b[1]) return 0;
            if(a[1] < b[1]) return -1;
            return 1;
        });
       
        int curSt = 0, curEd = 0, prevEnd = points[0][1];
        int i = 0;
        int arrows = 1;
        while(i < points.length){
            curSt = points[i][0];
            curEd = points[i][1];
            if(prevEnd < curSt){
                arrows++;
                prevEnd = curEd;
            }
            i++;
        }
        return arrows;
    }
}
