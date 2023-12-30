package December;

import java.util.HashMap;
import java.util.Map;

// Redistribute characters to make All strings equal
public class Problem_31 {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                char c  =word.charAt(i);
                map.put(c,map.getOrDefault(c,0) + 1);
            }
        }
        int wordsList = words.length;
        for(Character c : map.keySet()){
            if(map.get(c) % wordsList != 0)
                return false;
        }
        return true;
    }
}
