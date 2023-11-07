// Eliminate maximum number of monsters
public class Problem_07 {
    public int eliminateMaximum(int[] dist, int[] speed) {
        // double[] arrival = new double[dist.length];
        // for(int i = 0; i < dist.length; i++){
        //     arrival[i] = (double) dist[i]/speed[i];
        // }
        // Arrays.sort(arrival);
        // int ans = 0;
        // for(int i = 0; i < arrival.length; i++){
        //     if(arrival[i] <= i)
        //         break;
        //     ans++;
        // }
        // return ans;
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for(int i = 0; i < dist.length;i++){
            pq.offer((double) dist[i]/speed[i]);
        }
        int ans = 0;
        while(!pq.isEmpty()){
            if(pq.poll() <= ans)
                break;
            ans++;
        }
        return ans;
    }
}
