package December;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Path crossing
public class Problem_23 {
    public boolean isPathCrossing(String path) {
        Map<Character,Pair<Integer,Integer>> map = new HashMap<>();
        map.put('N', new Pair(0,1));
        map.put('S',new Pair(0,-1));
        map.put('E', new Pair(1,0));
        map.put('W',new Pair(-1,0));
        
        Set<Pair<Integer,Integer>> visited = new HashSet<>();
        visited.add(new Pair(0,0));
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            Pair<Integer,Integer> pd = map.get(c);
            x += pd.getKey();
            y += pd.getValue();
            Pair p = new Pair(x,y);
            if(visited.contains(p))
                return true;
            visited.add(p);
        }
        return false;
    }
}
