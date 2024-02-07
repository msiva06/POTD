package February;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Group anagrams
public class Problem_06 {
  public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagGrp = new HashMap<>();
        for(String str : strs){
            int[] chars = new int[26];
            for(int i = 0; i < str.length(); i++){
                int idx = str.charAt(i) - 'a';
                chars[idx]++;
            }

            String matchStr = getString(chars);
            System.out.println(str + " " + matchStr);
            if(!anagGrp.containsKey(matchStr)){
                anagGrp.put(matchStr,new ArrayList<String>());
            }
            anagGrp.get(matchStr).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for(String key : anagGrp.keySet()){
            res.add(new ArrayList<>(anagGrp.get(key)));
        }

        return res;
    }

    public String getString(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            sb.append(arr[i]);
            sb.append("#");
        }
        return sb.toString();
    }  
}
