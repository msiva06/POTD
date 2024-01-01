package January;

import java.util.Arrays;

// Assign cookies
public class Problem_01 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g1 = 0, s1 = 0;
        int minCount = 0;
        while(g1 < g.length && s1 < s.length){
            if(s[s1] >= g[g1]){
                minCount++;
                s1++;
                g1++;
            }
            else{
                s1++;
            }
        }
        return minCount;
    }
}
