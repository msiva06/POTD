package January;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

// Max profit in job scheduling
public class Problem_06 {
    class Jobs{
        int start;
        int end;
        int profit;
        public Jobs(int start,int end,int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

     public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Jobs> j = new ArrayList<>();
        int n = startTime.length;
        for(int i = 0; i < startTime.length; i++){
            Jobs job = new Jobs(startTime[i],endTime[i],profit[i]);
            j.add(job);
        }
        Collections.sort(j,(a,b) -> a.start - b.start);
        return jobSchedule(j);
    }

    public int jobSchedule( List<Jobs> jobs){
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
       int maxProfit = 0;
       for(int i = 0; i < jobs.size(); i++){
           int st = jobs.get(i).start;
           int ed = jobs.get(i).end;
           int p = jobs.get(i).profit;
           while(!pq.isEmpty() && st >= pq.peek()[0]){
               maxProfit = Math.max(maxProfit, pq.peek()[1]);
               pq.remove();
           }
           int[] newJob = new int[2];
           newJob[0] = ed;
           newJob[1] = maxProfit + p;
           pq.offer(newJob);
       }
       while(!pq.isEmpty()){
           maxProfit = Math.max(maxProfit,pq.peek()[1]);
           pq.remove();
       }
       return maxProfit;
    }
}
