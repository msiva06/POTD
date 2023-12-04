package November;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Diagonal Traverse II
public class Problem_22 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> res = new ArrayList<>();
        // Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        // queue.offer(new Pair<>(0,0));
        // while(!queue.isEmpty()){
        //     Pair<Integer,Integer> p = queue.poll();
        //     Integer row = p.getKey();
        //     Integer col = p.getValue();
        //     res.add(nums.get(row).get(col));
        //     if(col == 0 && row + 1 < nums.size()){
        //         queue.offer(new Pair<>(row + 1,col));
        //     }
        //     if(col + 1 < nums.get(row).size()){
        //         queue.offer(new Pair<>(row,col+1));
        //     }
                
        // }
        Map<Integer,List<Integer>> map = new HashMap<>();
        int n = 0;
        for(int row = nums.size()-1; row >= 0; row--){
            for(int col = 0; col < nums.get(row).size(); col++){
                int diag = row + col;
                if(!map.containsKey(diag))
                    map.put(diag, new ArrayList<>());
                map.get(diag).add(nums.get(row).get(col));
                n++;
            }
        }
        int curr = 0;
        while(map.containsKey(curr)){
            List<Integer> m = map.get(curr);
            res.addAll(m);
            curr++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
