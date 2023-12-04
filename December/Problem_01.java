package December;

// Check if two string arrays are equivalent
public class Problem_01 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int wordp1 = 0, wordp2 =0, strp1 = 0, strp2 =0;
        while(wordp1 < word1.length && wordp2 < word2.length){
            
            System.out.println(strp1 + " " + strp2);
            char c1 = word1[wordp1].charAt(strp1);
            char c2 = word2[wordp2].charAt(strp2);
            if(c1 != c2)
                return false;
            strp1++;
            strp2++;
            if(strp1 == word1[wordp1].length())
            {
                wordp1++;
                strp1 = 0;
            }
            if(strp2 == word2[wordp2].length())
            {
                wordp2++;
                strp2 = 0;
            }

        }
        if(wordp1 < word1.length || wordp2 < word2.length)
            return false;
        return true;
            
    }
}
