package February;

import java.util.PriorityQueue;

// Furthest building you can reach
public class Problem_17 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b- a);
        for(int i = 0; i < heights.length-1; i++){
            int diff = heights[i+1] - heights[i];
            if(diff <= 0)
                continue;
           
            bricks -= diff;
            pq.offer(diff);
            if(bricks < 0){
                if(ladders == 0){
                    return i;
                }
                int pastDiff = pq.poll();
                ladders -= 1;
                bricks += pastDiff;
            }
        }
        return heights.length-1;
    }
}
