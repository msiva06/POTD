package January;

// Min number of steps to make two strings anagram
public class Problem_12 {
    public int minSteps(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            sCount[c - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            tCount[c - 'a']++;
        }
        int steps = 0;
        for(int i = 0; i < 26; i++){
            steps += Math.abs(sCount[i] - tCount[i]);
        }
        return steps/2;

    }
}
