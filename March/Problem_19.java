package March;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// Task scheduler
public class Problem_19 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char t : tasks){
            freq.put(t,freq.getOrDefault(t,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b - a);
        List<Integer> val = new ArrayList<>(freq.values());
        for(Integer v : val){
            pq.offer(v);
        }

        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        while(!pq.isEmpty() || !q.isEmpty()){
            time += 1;
            if(!pq.isEmpty()){
                int cnt = pq.poll() - 1;
                if(cnt != 0){
                    q.offer(new int[]{cnt, time + n});
                }
            }
            if(!q.isEmpty() && q.peek()[1] == time){
                int[] popped = q.poll();
                pq.offer(popped[0]);
            }

        }
        return time;
    }
}
