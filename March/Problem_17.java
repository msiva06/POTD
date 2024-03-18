package March;

import java.util.ArrayList;
import java.util.List;

// Insert Interval
public class Problem_17 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if(intervals.length == 0){
            return new int[][]{newInterval};
        }
        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(intervals[mid][0] < newInterval[0]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        List<int[]> result = new ArrayList<>();
        for(int i = 0; i < left;i++){
            result.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        result.add(new int[]{newInterval[0],newInterval[1]});
        for(int i = left; i < n; i++){
            result.add(new int[]{intervals[i][0],intervals[i][1]});
        }

        List<int[]> merged = new ArrayList<>();
        for(int i = 0; i < result.size(); i++){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < result.get(i)[0]){
                merged.add(result.get(i));
            }
            else{
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], result.get(i)[1]);
            }
        }
        return merged.toArray(new int[0][]);

    }
}
