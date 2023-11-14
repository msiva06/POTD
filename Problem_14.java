// Unique length-3 Palindromic Subsequences
public class Problem_14 {
    public int countPalindromicSubsequence(String s) {
        // Set<Character> letters = new HashSet<Character>();
        // for(int i = 0; i < s.length(); i++){
        //     letters.add(s.charAt(i));
        // }
        // int ans = 0;
        // for(Character letter : letters){
        //     int i = -1;
        //     int j = 0;
        //     for(int k =0 ; k < s.length(); k++){
        //         if(letter == s.charAt(k)){
        //             if(i == -1){
        //                 i = k;
        //             }
        //             j = k;
        //         }
        //     }
        //     Set<Character> between = new HashSet<>();
        //     for(int l = i+1; l < j; l++){
        //         between.add(s.charAt(l));
        //     }
        //     ans += between.size();
        // }
        // return ans;

        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first,-1);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(first[c - 'a'] == -1){
                first[c - 'a'] = i;
            }
            last[c - 'a'] = i;
        }

        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(first[i] == -1)
                continue;
            Set<Character> between = new HashSet<>();
            for(int j = first[i]+1; j < last[i];j++){
                between.add(s.charAt(j));
            }
            ans += between.size();
        }
        return ans;
    }
}
