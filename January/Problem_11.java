package January;

// Determine if string halves are alike
public class Problem_11 {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int left = 0, right = n-1;
        int mid = left + (right - left)/2;
        int leftVowelCount = countVowels(s,left,mid);
        int rightVowelCount = countVowels(s,mid+1,right);
        
        if(leftVowelCount == rightVowelCount)
            return true;
        return false;
    }

    public int countVowels(String s,int start,int end){
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i = start; i <= end; i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c) >= 0)
                count++;
        }
        return count;
    }
}
