package February;

// First uniq character in a string
public class Problem_05 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            chars[idx]++;
        }

        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(chars[idx] == 1){
                return i;
            }
        }
        return -1;
    }
}
