package January;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

// Insert Delete GetRandom O(1)
public class Problem_15 {
    class RandomizedSet {
    List<Integer> arr;
    HashMap<Integer,Integer> map;
    Random rand = new Random();
    public RandomizedSet() {
        arr=new ArrayList<>();
        map = new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
        if(arr.contains(val))
            return false;
        arr.add(val);
        map.put(val,arr.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!arr.contains(val))
            return false;
        int idx = map.get(val);
        arr.set(idx,arr.get(arr.size()-1));
        map.put(arr.get(arr.size()-1),idx);
        arr.remove(arr.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}
}
