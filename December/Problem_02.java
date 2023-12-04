package December;

// Find words that can be formed by characters
public class Problem_02 {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i = 0; i < chars.length();i++){
            char c = chars.charAt(i);
            counts[c - 'a']++;
        }
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            int[] wordCount = new int[26];
            for(char c : word.toCharArray()){
                wordCount[c - 'a']++;
            }
            boolean good = true;
            for(int j = 0; j < 26;j++){
                if(counts[j] < wordCount[j]){
                    good = false;
                    break;
                } 
            }
            if(good){
                ans += word.length();
            }
        }

       return ans; 
    }
}
