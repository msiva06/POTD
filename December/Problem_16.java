package December;

// Valid anagram
public class Problem_16 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] anag = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            anag[c1 - 'a']++;
            anag[c2 - 'a']--;
        }
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(anag[c - 'a'] != 0)
                return false;
        }
        return true;
    }
}
