package February;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class UnionFind{
    int[] parent;
    int[] rank;
    int count;
    public UnionFind(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        Arrays.fill(rank,1);
        for(int i =0; i < n; i++){
            parent[i] = i;
        }
        this.count = n;
    }

    public int find(int x){
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x,int y){
        int px = find(x);
        int py = find(y);
        if(px == py){
            return;
        }

        if(rank[px] < rank[py]){
            parent[px] = py;
            rank[py] += rank[px];
        }

        else{
            parent[py] = px;
            rank[px] += rank[py];
        }
        this.count -= 1;
    }
}

// Greatest common divisor traversal
public class Problem_25 {
    public boolean canTraverseAllPairs(int[] nums) {

        int n1 = nums.length;
        UnionFind u = new UnionFind(n1);
        Map<Integer,Integer> fact = new HashMap<>();
        for(int i= 0; i < nums.length; i++){
            int f = 2;
            int n = nums[i];
            while(f * f <= n){
                if(n % f == 0){
                    if(fact.containsKey(f)){
                        u.union(fact.get(f),i);
                    }
                    else{
                        fact.put(f,i);
                    }
                }
                while(n % f == 0)
                    n /= f;
                f++;
            }
            if(n > 1){
                if(fact.containsKey(n)){
                    u.union(fact.get(n),i);
                }
                else{
                    fact.put(n,i);
                }
            }
        }
        return u.count == 1;
    }
}
