package November;
// Design graph with shortest path calculator
public class Problem_11 {
    List<List<Pair<Integer,Integer>>> graph;
    public Graph(int n, int[][] edges) {
        this.graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            this.graph.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            int cost = edges[i][2];
            this.graph.get(src).add(new Pair<>(dest,cost));
        }
    }
    
    public void addEdge(int[] edge) {
        int src = edge[0];
        int dest = edge[1];
        int cost = edge[2];
        this.graph.get(src).add(new Pair<>(dest,cost));
    }
    
    public int shortestPath(int node1, int node2) {
        int src = node1;
        int dest = node2;
        int[] costNode = new int[graph.size()];
        Arrays.fill(costNode,Integer.MAX_VALUE);
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b) -> a.get(0) - b.get(0));
        pq.offer(Arrays.asList(0,src));
        costNode[src] = 0;
        while(!pq.isEmpty()){
            var curr = pq.poll();
            int currNode = curr.get(1);
            int currCost = curr.get(0);
            if(currCost > costNode[currNode])
                continue;
            if(currNode == dest)
            {
                return currCost;
            }
            List<Pair<Integer,Integer>> neighbors = graph.get(currNode);
            for(Pair<Integer,Integer> nei : neighbors){
                int neighNode = nei.getKey();
                int neighCost = nei.getValue();
                int newCost = currCost + neighCost;
                if(newCost < costNode[neighNode]){
                    costNode[neighNode] = newCost;
                    pq.offer(Arrays.asList(newCost,neighNode));
                }
            }
        }
        return -1;

    }
}
