package January;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Determine if two strings are close
public class Problem_13 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        Map<Character,Integer> w1 = new HashMap<>();
        Map<Character,Integer> w2 = new HashMap<>();
        for(int i = 0; i < word1.length(); i++){
            char c = word1.charAt(i);
            w1.put(c, w1.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < word2.length(); i++){
            char c = word2.charAt(i);
            if(!w1.containsKey(c))
                return false;
            w2.put(c, w2.getOrDefault(c,0) + 1);
        }
       
        List<Integer> w1Val = new ArrayList<>(w1.values());
        List<Integer> w2Val = new ArrayList<>(w2.values());
        Collections.sort(w1Val);
        Collections.sort(w2Val);
        return w1Val.equals(w2Val);

    }
}
