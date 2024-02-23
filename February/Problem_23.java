package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
    int node;
    int cost;
    public Pair(int node,int cost){
        this.node = node;
        this.cost = cost;
    }
}

// Cheapest flights within K stops
public class Problem_23 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);

        List<Pair>[] adjList = new ArrayList[n];

        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }
        for(int[] f : flights){
            int sorc = f[0];
            int dest = f[1];
            int price = f[2];
            adjList[sorc].add(new Pair(dest,price));
        }

        Queue<Pair> pq = new LinkedList<>();
        pq.offer(new Pair(src,0));
        cost[src] = 0;
        int stops = 0;
        while(!pq.isEmpty() && stops <= k){
            int size = pq.size();
            for(int i = 0; i < size; i++){
                Pair p = pq.poll();
                int price = p.cost;
                int node = p.node;

                List<Pair> adj = adjList[node];
                for(Pair pr: adj){
                    if(price + pr.cost < cost[pr.node]){
                        cost[pr.node] = price + pr.cost;
                        pq.offer(new Pair(pr.node,cost[pr.node]));
                    }
                }
            }
            
            stops++;
           

        }
        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }
}
