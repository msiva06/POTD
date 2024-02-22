package February;

// Find the town judge
public class Problem_22 {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];
        if(trust.length < n-1){
            return -1;
        }

        for(int i = 0; i < trust.length; i++){
            int src = trust[i][0];
            int dest = trust[i][1];
            inDegree[dest]++;
            outDegree[src]++;
        }

        for(int i = 1; i < inDegree.length; i++){
            if(inDegree[i] == n-1 && outDegree[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
