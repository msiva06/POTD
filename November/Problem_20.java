package November;
import java.util.HashMap;
import java.util.Map;

// Minimum amount of time to collect garbage
public class Problem_20 {
    public int garbageCollection(String[] garbage, int[] travel) {
        String garbages = "MGP";
        Map<Character,Integer> lastOccur = new HashMap<>();
        int[] prefixTravel = new int[travel.length+1];
        prefixTravel[1] = travel[0];
        for(int i = 1; i < travel.length; i++){
            prefixTravel[i+1] = prefixTravel[i] + travel[i];
        }
        int ans = 0;
        for(int i = 0; i < garbage.length; i++){
            for(char c : garbage[i].toCharArray()){
                lastOccur.put(c,i);
            }
            ans += garbage[i].length();
        }
        for(int i = 0; i < garbages.length(); i++){
            char c = garbages.charAt(i);
            if(lastOccur.containsKey(c)){
                int lastIdx = lastOccur.get(c);
                ans += prefixTravel[lastIdx];
            }
        }
        return ans;
    }
}
