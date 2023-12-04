package November;
// Restore the array from adjacent pairs
public class Problem_10 {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < adjacentPairs.length; i++){
            int x = adjacentPairs[i][0];
            int y = adjacentPairs[i][1];
            if(!graph.containsKey(x)){
                graph.put(x,new ArrayList<>());
            }
            if(!graph.containsKey(y)){
                graph.put(y,new ArrayList<>());
            }
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        int root = 0;
        for(Integer key : graph.keySet()){
            if(graph.get(key).size() == 1)
            {
                root = key;
                break;
            }
        }
        int[] ans = new int[graph.size()];
        dfs(graph,Integer.MAX_VALUE, root,ans,0);
        return ans;
    }

    public void dfs(Map<Integer,List<Integer>> graph,int prev,int curr,int[] ans,int idx){
        if(idx == graph.size())
            return;
        ans[idx] = curr;
        List<Integer> neighbors = graph.get(curr);
        for(int nei : neighbors){
            if(prev != nei){
                dfs(graph,curr,nei,ans,idx+1);
            }
        }
    }
}
